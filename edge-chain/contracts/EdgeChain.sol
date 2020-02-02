pragma solidity >=0.4.22 <0.6.0;

contract EdgeChain {
    
    uint256 private constant RICH_LIMIT = 1000000000;
    uint256 private constant REHAB = 3;
    uint256 private constant BLOCK_TX = 1;
    uint256 private constant CHECK_SEC = 3;
    uint256 private constant CHECK_PAY = 5;
    uint256 private constant PATIENCE = 7;
    address private constant ADMINISTRATOR = 0xCbb4946C2195A01Cac065456F6781F9191a43db0;
    string  private constant URL = "www.github.com";
    
    struct Device {
        bool exists;
        uint256 unsecured_tx;
        uint256 penalty;
        uint256 gas_used;
    }
    
    mapping (address => Device) private devs;
    address payable[] private dev_add;
    uint256 private last_pay_block = 0;
    uint256 private last_sec_block = 0;
    uint256 private version = 0;
    
    function () external payable{}
    
    function getBalance() public view returns (uint256){
        return address(this).balance;
    }
    
    function getUserBalance() public view returns (uint256){
        return msg.sender.balance;
    }
    
    function getVersion() public view returns (uint256){
        return version;
    }
    
    function changeVersion(uint256 _version) public returns (uint256) {
        //if(msg.sender != ADMINISTRATOR){
        if(_version < 5){
            return 1;
        }
        version = _version;
        return 0;
    }
    
    function any_operation(uint256 _version) public returns (uint256) {
        
        if(!devs[msg.sender].exists){
            devs[msg.sender] = Device({exists:true, unsecured_tx:0, penalty:1, gas_used:0});
            dev_add.push(msg.sender);
        }
        if(_version < version){
            return 2;
        }
        if(devs[msg.sender].penalty > PATIENCE){
            return 3;
        }
        
        uint256 startGas = gasleft();
        devs[msg.sender].unsecured_tx ++;
        
        if(block.number - last_sec_block > CHECK_SEC){
            uint256 loppnum = dev_add.length;
            for (uint256 i = 0; i < loppnum; i++) {
                if((block.number-last_sec_block)*BLOCK_TX/dev_add.length < devs[dev_add[i]].unsecured_tx){
                    devs[dev_add[i]].penalty += REHAB;
                }else if(devs[dev_add[i]].penalty > 1){
                    devs[dev_add[i]].penalty --;
                }
                devs[dev_add[i]].unsecured_tx = 0;
            }
            last_sec_block = block.number;
        }
        
        if(block.number - last_pay_block > CHECK_PAY){
            uint256 loppnum = dev_add.length;
            for (uint256 i = 0; i < loppnum; i++) {
                if(devs[dev_add[i]].gas_used > 0){
                    uint256 gasToSend = devs[dev_add[i]].gas_used/devs[dev_add[i]].penalty;
                    devs[dev_add[i]].gas_used = 0;
                    dev_add[i].transfer(gasToSend + 5537);
                    //sumar gas used
                }
            }
            last_pay_block = block.number;
        }
        
        //-------------
        //Functionality
        //-------------
        
        devs[msg.sender].gas_used += startGas - gasleft() + 22664;
        return startGas - gasleft() + 22664;
    }
    
}
