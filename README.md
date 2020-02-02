# :gear: Edge-Chain
Design and implementation of a blockchain architecture, located on the edge, to provide secure support, reliability, monitoring and malicious behavior control of IoT devices.

To see my bachelor thesis in my university official repository click [here](http://castor.det.uvigo.es:8080/xmlui/handle/123456789/345?locale-attribute=en).

I strongly advise to read the [disclaimer](#exclamation-disclaimers) section before reading/using the code.

## :hammer_and_wrench: Technologies
- The smart contract language utilized was [Solidity](https://solidity.readthedocs.io/en/v0.6.2/) with Solc as Solidity compiler.
- The IoT client was developed using [Java 11] (https://docs.oracle.com/en/java/javase/11/).
- The Ethereum-Java interface used on the project was [web3j](https://github.com/web3j).
- [Truffle](https://www.trufflesuite.com/truffle) was used as a contract migration tool and as a directory manager too.
- [Ganache](https://www.trufflesuite.com/ganache) was used as a testing blockchain network for the developing phase.
- The final Blockchain network was created using [GoEthereum](https://github.com/ethereum/go-ethereum).
- [Solidity Remix](https://remix.ethereum.org/) was used too in the Smart Contract development.
- [Maven](https://maven.apache.org/) was used as a depencency management tool.


## :rocket: Set-up

- ### Installing solidity and solc:
```
sudo add-apt-repository ppa:ethereum/ethereum
sudo apt-get update
sudo apt-get install solc
```

- ### Installing Java JDK:
```
sudo apt install openjdk-11-jre-headless
```

- ### Installing Web3j:
You can find the version of web3j I used in my github repository but you can find the newest one in the official Web3j repository.
Remember to give the web3j executable file execution permissions. You can find that file in web3j-4.1.1/bin/web3j
```
sudo chmod 750 web3j
```

- ### Installing GoEthereum:
To install Geth I would advise to follow this [link](https://github.com/ethereum/go-ethereum/wiki/Installing-Geth). Chances are that It is much more updated than the method I used in 2019.


## :gift: Wrappers
In order to use a Smart Contract inside a Java class we need to create a Java Wrapper class from the .sol file first. To do so (Let's assume that our contract is called HelloWorld.sol) we need to:
- Create the .bin and .abi files from the .sol using the solidity compiler (solc):
```
solc contracts/HelloWorld.sol  --bin --abi --optimize -o contracts/
```
- Use the previously mentioned web3j file (remember to give it executable permissions) to create the .java file from the .bin and .abi files:
```
~/Software/web3j-4.1.1/bin/web3j solidity generate -b contracts/HelloWorld.bin -a contracts/HelloWorld.abi -o contracts/ -p com.edge.chain
```

## :exclamation: Disclaimers
- Currently the documentation is only in Spanish; an English version will be uploaded as soon as I finish one.
- When moving to the Netherlands I forgot to bring my two Blackberry Pi 3b+ with me so, **I do not have the last version of the Java client nor the last version of the EdgeChain.sol contract with me.** They will be uploaded in my next visit to Spain.
- Solidity is a young and rapidly changing technology so there are high chances of finding obsolete methods in my code.
