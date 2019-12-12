pragma solidity >= 0.5.0 < 0.6.0;

import "./DateTime.sol";

contract Contract {
    bool public actif;
    bool actif_verifier_retard = true;
    bool actif_verifier_defaut = true;
    
    bool public paye = false;
    uint public nonow = now;
    
    uint public prix;
    uint majoration = 2;
    
    DateTime public date_paiement;
    DateTime public date_defaut;
    
    address client;
    address prestataire;
    address oracle;
    
    address[] verif_prestataire_client;
    mapping(address => bool) public validateur_reprendre;
    
    constructor(address _client, uint _prix) public {
        actif = true;
        prix = _prix;
        
        date_paiement = new DateTime();
        date_paiement.toTimestamp(2019, 12, 1);
        
        date_defaut = new DateTime();
        
        prestataire = msg.sender;
        client = _client;
        
        verif_prestataire_client = [prestataire, client];
    }
    
    function passe(uint _date) internal view returns (bool){
        return _date < now;
    }
    
    function suspendre() public ouValidateur(verif_prestataire_client) estActif{
        actif = false;
    }
    
    function reprendre() public estInactif etValidateur(validateur_reprendre, verif_prestataire_client) {
        actif = true;
    }
    
    function approuver_paiement() public {
        if(paye) {
            date_paiement.addDays(30);
            actif_verifier_retard = true;
        }
    }
    
    function verifier_retard() public {
        require(actif_verifier_retard);
        if(passe(date_paiement._timestamp())) {
            prix = prix * majoration;
            
            date_defaut.parseTimestamp(now);
            date_defaut.addDays(10);
            
            actif_verifier_retard = false;
        }
    }
    
    function verifier_defaut() public {
        require(actif_verifier_defaut);
        if(passe(date_defaut._timestamp())) {
            suspendre();
            actif_verifier_defaut = false;
        }
    }
    
    modifier estActif {
        require(actif);
        _;
    }
    
    modifier estInactif {
        require(!actif);
        _;
    }
    
    modifier ouValidateur(address[] storage parties) {
        for(uint i = 0; i < parties.length; ++i) {
            if(msg.sender == parties[i]) {
                _;
                return;
            }
        }
        revert();
    }
    
    modifier etValidateur(mapping(address => bool) storage _registre, address[] storage parties) {
        
        for(uint i = 0; i < parties.length; ++i) {
            if(msg.sender == parties[i]) {
                _registre[parties[i]] = true;
                break;
            }
        }
        
        for(uint i = 0; i < parties.length; ++i) {
            if(_registre[parties[i]] == false) {
                revert();
            }
        }
        
        for(uint i = 0; i < parties.length; ++i) {
            _registre[parties[i]] = false;
        } 
        
        _;
    }
}
