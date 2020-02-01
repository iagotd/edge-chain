pragma solidity >=0.5.2 <0.6.0;

contract HelloWorld {

    uint256 private hellonum;
    uint256 private version;
    address private constant admin = 0xCbb4946C2195A01Cac065456F6781F9191a43db0;
    
    function hi() public pure returns (bytes32) {
        return 'is free';
    }

    function hinofree() public returns (bytes32) {
        hellonum = hellonum + 1;
        return 'no free';
    }
    
    function getHellonum() public view returns (uint256) {
        return hellonum;
    }
    
    function getVersion() public view returns (uint256) {
        return version;
    }
    
    function setVersion(uint256 _version) public returns(bool success) {
        require(_version > version, "La versión debe ser superior.");
        version = _version;
        return true;
    }
    
}
