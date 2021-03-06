package com.edge.chain;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.1.1.
 */
public class EdgeChain extends Contract {
    private static final String BINARY = "608060405260006002556000600355600060045534801561001f57600080fd5b5061057c8061002f6000396000f3fe60806040526004361061004a5760003560e01c80630d8e6e2c1461004c578063107752fe1461007357806312065fe01461009d57806354055ab0146100b2578063b7013dc1146100dc575b005b34801561005857600080fd5b506100616100f1565b60408051918252519081900360200190f35b34801561007f57600080fd5b506100616004803603602081101561009657600080fd5b50356100f7565b3480156100a957600080fd5b50610061610118565b3480156100be57600080fd5b50610061600480360360208110156100d557600080fd5b503561011c565b3480156100e857600080fd5b50610061610542565b60045490565b6000600582101561010a57506001610113565b50600481905560005b919050565b4790565b3360009081526020819052604081205460ff166101c657604080516080810182526001808252600060208084018281528486018481526060860184815233808652938590529684209551865460ff191690151517865590518585015551600285015593516003909301929092558054808201825591527fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf60180546001600160a01b03191690911790555b6004548210156101d857506002610113565b33600090815260208190526040902060020154600710156101fb57506003610113565b60005a33600090815260208190526040902060019081018054909101905560038054919250439190910311156103995760015460005b81811015610392576000806001838154811061024957fe5b60009182526020808320909101546001600160a01b031683528201929092526040019020600190810154905460035443038161028157fe5b0410156102cd5760036000806001848154811061029a57fe5b60009182526020808320909101546001600160a01b0316835282019290925260400190206002018054909101905561034d565b6001600080600184815481106102df57fe5b60009182526020808320909101546001600160a01b03168352820192909252604001902060020154111561034d576000806001838154811061031d57fe5b60009182526020808320909101546001600160a01b03168352820192909252604001902060020180546000190190555b60008060006001848154811061035f57fe5b60009182526020808320909101546001600160a01b03168352820192909252604001902060019081019190915501610231565b5050436003555b6005600254430311156105135760015460005b8181101561050c576000806000600184815481106103c657fe5b60009182526020808320909101546001600160a01b0316835282019290925260400190206003015411156105045760008060006001848154811061040657fe5b60009182526020808320909101546001600160a01b03168352820192909252604001812060020154600180549192918291908690811061044257fe5b60009182526020808320909101546001600160a01b031683528201929092526040019020600301548161047157fe5b04905060008060006001858154811061048657fe5b60009182526020808320909101546001600160a01b0316835282019290925260400190206003015560018054839081106104bc57fe5b60009182526020822001546040516001600160a01b03909116916115a1840180156108fc02929091818181858888f19350505050158015610501573d6000803e3d6000fd5b50505b6001016103ac565b5050436002555b5a3360009081526020819052604090206003018054918303919091016158880190555a90036158880192915050565b33319056fea265627a7a72315820ac8ed1c4a125261427cb1f93983a9664812ab584ab47a2f804c997be4b99ec1564736f6c63430005100032";

    public static final String FUNC_ANY_OPERATION = "any_operation";

    public static final String FUNC_CHANGEVERSION = "changeVersion";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_GETUSERBALANCE = "getUserBalance";

    public static final String FUNC_GETVERSION = "getVersion";

    @Deprecated
    protected EdgeChain(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected EdgeChain(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected EdgeChain(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected EdgeChain(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> any_operation(BigInteger _version) {
        final Function function = new Function(
                FUNC_ANY_OPERATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_version)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> changeVersion(BigInteger _version) {
        final Function function = new Function(
                FUNC_CHANGEVERSION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_version)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getBalance() {
        final Function function = new Function(FUNC_GETBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getUserBalance() {
        final Function function = new Function(FUNC_GETUSERBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getVersion() {
        final Function function = new Function(FUNC_GETVERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static EdgeChain load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new EdgeChain(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static EdgeChain load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new EdgeChain(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static EdgeChain load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new EdgeChain(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static EdgeChain load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new EdgeChain(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<EdgeChain> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(EdgeChain.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<EdgeChain> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(EdgeChain.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<EdgeChain> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(EdgeChain.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<EdgeChain> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(EdgeChain.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
