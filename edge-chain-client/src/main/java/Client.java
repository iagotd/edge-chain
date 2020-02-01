import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client {

    public static void main(String[] args) {

        //Web3j web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:8545"));
        Web3j web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:7545"));
        Credentials credentials = Credentials.create("5322d3d66f7bea7f5a9300c32d29b093625d22ffaa99105b641041b685b6ecb2");
        int version = 0;

        /*Credentials credentials = null;
        try {
            //credentials = WalletUtils.loadCredentials("iagotd0", "/home/iago/git/edge-chain-real/myDataDir/keystore/UTC--2019-03-26T16-19-23.799121045Z--cbb4946c2195a01cac065456f6781f9191a43db0");

            String privateKey = credentials.getEcKeyPair().getPrivateKey().toString(16);
            String publicKey = credentials.getEcKeyPair().getPublicKey().toString(16);
            String addr = credentials.getAddress();

            System.out.println("Private key: " + privateKey);
            System.out.println("Public key: " + publicKey);
            System.out.println("Address: " + addr + "\n");

        } catch (IOException | CipherException e) {
            e.printStackTrace();
        }*/

        System.out.println("Contract loading.");
        //helloWorldContract = HelloWorld.load("0x86C8D5AdD992E4e708b249edE403d033a589fC35", web3j, credentials, BigInteger.valueOf(2000000), BigInteger.valueOf(2000000));
        HelloWorld helloWorldContract = HelloWorld.load("0xbf64a222e3087611c29D9CDafC5ED9EFeba7925C", web3j, credentials, BigInteger.valueOf(200000000), BigInteger.valueOf(6721975));
        System.out.println("Contract loaded.\n");

        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            TransactionReceipt transactionReceipt;
            String response = "";
            int numero = -1;

            while(true){

                numero = -1;
                response = "";

                System.out.print("Introduzca un numero: ");
                numero = Integer.parseInt (br.readLine());
                switch(numero){
                    case 0:{
                        response = hexToASCII(bytesToHex(helloWorldContract.hi().send()));
                        System.out.println("0: Saying hi: " +response);
                        break;
                    }
                    case 1:{
                        System.out.println("1: Getting HelloNum: " +helloWorldContract.getHellonum().send());
                        break;
                    }
                    case 2:{
                        System.out.println("2: helloWorldContract.hinofree().send()");
                        transactionReceipt = helloWorldContract.hinofree().send();
                        break;
                    }
                    case 3:{
                        System.out.println("3: Getting version: " +helloWorldContract.getVersion().send());
                        break;
                    }
                    case 4:{
                        System.out.println("4: helloWorldContract.setVersion(BigInteger.valueOf(7)).send()");
                        transactionReceipt = helloWorldContract.setVersion(BigInteger.valueOf(7)).sendAsync().get();

                        break;
                    }
                    case 5:{
                        System.out.println("5: getting version from firebase: " + sendGet());

                        break;
                    }
                    default:
                        throw new IllegalStateException("Unexpected value: " + numero);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Thread t = new Thread() {
        //    @Override
        //    public void run() {
        //        while(true) {
        //            try {
        //                Thread.sleep(1000);
        //                //your code here...
        //
        //               try {
        //                    System.out.println("Response: "+helloWorldContract.hi().send());
        //                    //TransactionReceipt transactionReceipt = helloWorldContract.hinofree().send();
        //                } catch (Exception e) {
        //                    e.printStackTrace();
        //                }
        //
        //            } catch (InterruptedException ie) {
        //            }
        //        }
        //    }
        //};
        //t.start();


    }

    private static String bytesToHex(byte[] hashInBytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    private static String hexToASCII(String hexValue) {
        char extraZero = (char) Integer.parseInt("00", 16);
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < hexValue.length(); i += 2) {
            String str = hexValue.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        return output.toString().replaceAll(String.valueOf(extraZero), "");
    }

    private static int sendGet() throws Exception {

        URL obj = new URL("https://learningfirebase-e409e.firebaseio.com/version.json");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to Firebase");
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return Integer.parseInt(response.toString());
    }


}

