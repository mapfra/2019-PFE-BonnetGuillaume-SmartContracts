const Web3 = require("web3");

web3 = new Web3("http://localhost:7545");

var account;
web3.eth.getAccounts().then(function(result){
  account = result[0];
  web3.eth.defaultAccount = account;

  const fs = require('fs');
  const contract_abi = JSON.parse(fs.readFileSync('../smart_contract/build/contracts/ServiceDelivery.json', 'utf8')).abi;

  const contract_address = "0xC77b55991D3b73C32A11d6ab2d70b967e27bc092";

  var contract = new web3.eth.Contract(contract_abi, contract_address);
  contract.options.from = web3.eth.defaultAccount;
  contract.methods.verify().send();

  setTimeout(()=>{contract.methods.price().call().then((res) => {console.log(res)});}, 2500);
})