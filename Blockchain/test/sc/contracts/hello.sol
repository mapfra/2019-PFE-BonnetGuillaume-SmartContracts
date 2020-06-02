pragma solidity ^0.5.0;

contract Hello {
  string public message;

  function setMessage(string memory initialMessage) public {
    message = initialMessage;
  }
}
