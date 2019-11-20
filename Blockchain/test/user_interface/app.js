const Web3 = require('web3')

var web3 = new Web3(new Web3.providers.HttpProvider("http://127.0.0.1:8000"));
//var balanceWei = web3.eth.getBalance(account).toNumber();
console.log(web3)
