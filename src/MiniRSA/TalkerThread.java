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
        boolean done = false; 
        while(!done) {
          
            String data = scanner.nextLine();
            
            if("quit".equals(data)) {
                con.sendMsg("quit");//got to propagate the quit to kill all threads
                done = true;
            } else if("propQuit".equals(data)){//got to propagate the quit to kill all threads
                done = true;
            } else {
                con.sendMsg(data);
            }

        }
    }

    
}
