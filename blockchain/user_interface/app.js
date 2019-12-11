const Web3 = require("web3");

web3 = new Web3("http://localhost:7545");
const accounts = await web3.eth.getAccounts();

var account;
web3.eth.getAccounts().then(function(result){
  account = result[0];
  web3.eth.defaultAccount = account;

  const fs = require('fs');
  const contract_abi = JSON.parse(fs.readFileSync('../smart_contract/build/contracts/DieselPrice.json', 'utf8')).abi;

  const contract_address = "0x7b9ea79fADc019ED3e9898E25fA368089c2278e2";

  var contract = new web3.eth.Contract(contract_abi, contract_address);
  contract.options.from = web3.eth.defaultAccount;
  contract.methods.update().send();
  contract.methods.dieselPriceUSD().call().then(console.log);

  //setTimeout(()=>{contract.methods.price().call().then((res) => {console.log(res)});}, 2500);
})
