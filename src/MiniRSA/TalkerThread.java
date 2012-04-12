package MiniRSA;

import java.util.Scanner;

/**
 * @author michaelpato
 *
 * this class extends thread and handles sending messages to the socket
 *
 */
public class TalkerThread extends Thread{

    SocketConnector con;
    boolean done = false; 
    
    public TalkerThread(SocketConnector con) {
        this.con = con;
    }
    
    /**
     * @see java.lang.Thread#run()
     */
    public void run() {
        talk();

    }
    
    private void talk() {
        Scanner scanner = new Scanner(System.in);    
        while(!done) {
             
        String data = scanner.nextLine();
        if("quit".equals(data)) {
            done = true;
        }
        
        con.sendMsg(data);
        }
    }

    /**
     * @param done the done to set
     */
    public void setDone(boolean done) {
        this.done = done;
        
    }

    
}
