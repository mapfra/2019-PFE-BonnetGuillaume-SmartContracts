pragma solidity >= 0.5.0 < 0.6.0;

import "./DateTime.sol";

contract Contract {
    bool public actif;
    
    uint public nonow = now;
    
    uint price;
    uint majoration;
    
    uint date_paiement;
    uint date_defaut;
    
    address client;
    address prestataire;
    address oracle;
    
    address[] verif_prestataire_client;
    mapping(address => bool) public validateur_reprendre;
    
    DateTime dateManager = new DateTime();
    
    constructor(address _client, uint _price) public {
        actif = true;
        price = _price;
        
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
        //TODO
    }
    
    function verifier_retard() public {
        //TODO
    }
    
    function verifier_defaut() public {
        //TODO
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
