package MiniRSA;

/**
 * @author michaelpato
 *
 * this class extends thread and handles listening to the socket for 
 * any new msgs then habdles it
 *
 */
public class ListenerThread extends Thread{
    SocketConnector con;

    
    public ListenerThread(SocketConnector con) {
        this.con = con;
    }
    /**
     * @see java.lang.Thread#run()
     */
    public void run() {
        listen();

    }
    
    private void listen() {
        boolean done = false; 
        while(!done) {
            String data = con.getReply();
            if("quit".equals(data)) {
                con.sendMsg("propQuit");//got to propagate the quit to kill all threads
                done = true;
                System.out.println("----Your buddy has quit.----");
            } else if("propQuit".equals(data)){//got to propagate the quit to kill all threads
                done = true;
                con.sendMsg("propQuit");
            } else {
                System.out.println(data);
            }

        }
        
        
    }
   
    
    
}
