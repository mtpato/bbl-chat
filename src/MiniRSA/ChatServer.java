package MiniRSA;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatServer {

    ServerSocketConnector con;
    ListenerThread listener;
    TalkerThread talker;
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //make this take command line arguments 
        
        new ChatServer().run();

    }
     
    void run() {
        
        
       
        con = new ServerSocketConnector(3100);

        System.out.println("about to conn");
        con.initCon();
        
        listener = new ListenerThread(con);
        listener.start();
        
        talker = new TalkerThread(con);
        talker.start();

            
        
        try {
            talker.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        try {
            listener.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Thanks for using BBL-Chat!");
        
        
        //System.out.println("done a");
        
    }

}
