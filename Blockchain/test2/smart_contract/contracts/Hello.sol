pragma solidity ^0.5.0;

contract Hello {
  string public message = "Hello World";

  function setMessage(string memory newMessage) public {
    message = newMessage;
  }

  function getAddress() public view returns(address) {
    return msg.sender;
  }
}
