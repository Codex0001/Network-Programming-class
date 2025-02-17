import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {   
        try {
            Socket skt = new Socket("localhost", 1234);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(skt.getInputStream())
            );
            
            System.out.print("Received string: '");
            String receivedData = in.readLine();
            System.out.println(receivedData + "'");
            
            in.close();
            skt.close();
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}