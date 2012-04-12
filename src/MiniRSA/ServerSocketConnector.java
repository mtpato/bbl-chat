package MiniRSA;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ServerSocketConnector extends SocketConnector{

    ServerSocket serverSocket;
    
    public ServerSocketConnector(int port) {
        super(port, null);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean initCon() {
        try {
            serverSocket = new ServerSocket(port);
                     
            socket = serverSocket.accept();
            
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
    
    /*@Override
    public void closeCon() {
        try {
            serverSocket.close();

        } catch (IOException e) {
            System.err.println("Could not close socket.");
            e.printStackTrace();
        }
    }*/
}
