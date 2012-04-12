package MiniRSA;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * this is the socket connector. it handles the actual communication 
 * with the server. 
 *
 */
public class SocketConnector {
    int port;
    InetAddress hostname;
    Scanner input;
    PrintWriter output;
    Socket socket;
    
    public SocketConnector(int port, InetAddress hostname) {
        this.port = port;
        this.hostname = hostname;  
    }
    
    /**
     * sends a message to the server 
     * 
     * @param msg
     */
    public void sendMsg(String msg) {
        if (msg != null && !msg.equals("")) {

        	output.print(msg);
        	output.flush();
        }
    }
    
    
    /**
     * gets the reply from the server 
     * 
     * @return String, the reply from the server 
     */
    public String getReply() {
        String reply;
        try {
            
            reply = input.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println("REPLY NOT RECIEVED IN ANDROID");
            return null;
        }
        
        return reply;
    }
    
    
    /**
     * inits a connection with the server
     * 
     * @return boolean, true if the connection was established and false if it was not 
     */
    public boolean initCon() {
        try {
            String hostaddr = hostname.getHostAddress();
            socket = new Socket(hostaddr, port);
            
            input = new Scanner(socket.getInputStream());
            output = new PrintWriter(socket.getOutputStream());
            return true;
        } catch (UnknownHostException e) {
            System.err.println("Error connecting to port " + port + "! Unknown host.");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.err.println("Error connecting to port.");
            e.printStackTrace();
            return false;
        }
        
    
    }
    
    /**
     * closes the connection with the server 
     */
    public void closeCon() {
        try {
            socket.close();

        } catch (IOException e) {
            System.err.println("Could not close socket.");
            e.printStackTrace();
        }
    }

}
