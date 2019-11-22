pragma solidity >=0.4.21 <0.6.0;

contract contract {
	address public recipient = msg.sender;
	
	address public client = 0x33c6711d314f5bbCAa09cf49CF0c734D038A642B;

	bool public active = true;
	bool public isLate = false;

	uint public price = 10;

	string public pdfHash;

	uint public dueDate = now + 30 seconds;
	uint public lastDate = dueDate + 15 days;
	
	constructor(String _pdfHash) public {
		pdfHash = _pdfHash;
	}
	
	modifier isActive {
		require(active);
		_;
	}

	function late() public {
		require(now > dueDate && !isLate);
    	price += 1;
    	isLate = true;
	}

	function verify() public returns(uint)  {
		late();
		return price;
	}
};
