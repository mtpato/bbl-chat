package MiniRSA;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ChatServer {

    ServerSocketConnector con;
    ListenerThread listener;
    
    
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
        
        //con.sendMsg("hello");
        
        con.sendMsg("server: talking to you ");
        con.sendMsg("server: yap yap");
        con.sendMsg("Server: im bored");
        con.sendMsg("quit");
        //con.sendMsg("quit");
        //System.out.println(con.getReply());

        
        //System.out.println(con.getReply());
        System.out.println("done a");
        
    }

}
