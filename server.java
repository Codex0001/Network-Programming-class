import java.io.*;
import java.net.*;

public class server {
    public static void main(String args[]) {
        String data = "Toobie ornaught toobie";
        
        try {
            ServerSocket srvr = new ServerSocket(1234);
            System.out.println("Server started, waiting for connections...");
            
            Socket skt = srvr.accept();
            System.out.println("Server has connected!");
            
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            System.out.println("Sending string: '" + data + "'");
            out.println(data);
            
            out.close();
            skt.close();
            srvr.close();
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
