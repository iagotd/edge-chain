import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
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
public class HelloWorld extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610186806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630d8e6e2c1461005c578063408def1e1461007657806381cc6bd6146100a75780639804ad05146100af578063a99dca3f146100b7575b600080fd5b6100646100bf565b60408051918252519081900360200190f35b6100936004803603602081101561008c57600080fd5b50356100c5565b604080519115158252519081900360200190f35b610064610129565b61006461012f565b610064610149565b60015490565b600060015482116101205760408051600160e51b62461bcd02815260206004820152601e60248201527f4c61207665727369c3b36e206465626520736572207375706572696f722e0000604482015290519081900360640190fd5b50600190815590565b60005490565b600080546001019055600160c81b666e6f20667265650290565b600160c81b6669732066726565029056fea165627a7a72305820849a3fc8ea8e75b54e3b4a70ca24da0180cf722d0081cb863a04333464f338340029";

    public static final String FUNC_GETVERSION = "getVersion";

    public static final String FUNC_SETVERSION = "setVersion";

    public static final String FUNC_GETHELLONUM = "getHellonum";

    public static final String FUNC_HINOFREE = "hinofree";

    public static final String FUNC_HI = "hi";

    @Deprecated
    protected HelloWorld(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected HelloWorld(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected HelloWorld(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected HelloWorld(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getVersion() {
        final Function function = new Function(FUNC_GETVERSION,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setVersion(BigInteger _version) {
        final Function function = new Function(
                FUNC_SETVERSION,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_version)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getHellonum() {
        final Function function = new Function(FUNC_GETHELLONUM,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> hinofree() {
        final Function function = new Function(
                FUNC_HINOFREE,
                Arrays.<Type>asList(),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> hi() {
        final Function function = new Function(FUNC_HI,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    @Deprecated
    public static HelloWorld load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorld(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static HelloWorld load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorld(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static HelloWorld load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new HelloWorld(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static HelloWorld load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new HelloWorld(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<HelloWorld> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HelloWorld.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HelloWorld> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HelloWorld.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<HelloWorld> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HelloWorld.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HelloWorld> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HelloWorld.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}