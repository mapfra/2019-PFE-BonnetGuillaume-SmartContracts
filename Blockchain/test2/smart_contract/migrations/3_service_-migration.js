const ServiceDelivery = artifacts.require("ServiceDelivery");

module.exports = function(deployer) {
  deployer.deploy(ServiceDelivery, 10);
};
