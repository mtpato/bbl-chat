package MiniRSA;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ChatServer {

    ServerSocketConnector con;
    
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
        
        con.sendMsg("hello");

        con.sendMsg("you are nice");
        con.sendMsg("want to be friedns ");
        con.sendMsg("i do ");
        con.sendMsg("see ya ");
        con.sendMsg("quit");

        
        //System.out.println(con.getReply());
        System.out.println("done a");
        
    }

}
