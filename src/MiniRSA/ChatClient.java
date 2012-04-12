/**
 * 
 */
package MiniRSA;

import java.net.InetAddress;
import java.net.UnknownHostException;



/**
 * @author michaelpato
 *
 */
public class ChatClient{

    SocketConnector con;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //make this take command line arguments 
        
        new ChatClient().run();

    }
    //InetAddress.getByName("10.0.2.2")
    void run() {

        con = new SocketConnector(3100, "localhost");

        System.out.println("about to conn");
        con.initCon();
        

        //System.out.println(con.getReply());
     
        con.sendMsg("hello to you too");
        con.sendMsg("you look nice");
        con.sendMsg("oh thanks ");
        con.sendMsg("quit");
        
        System.out.println("done b");
        
        
    }
    


}
