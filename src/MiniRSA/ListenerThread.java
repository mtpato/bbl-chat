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
    boolean done = false;
    
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

        while(!done) {
            String data = con.getReply();
            if("quit".equals(data)) {
                done = true;
            }

            System.out.println(data);
                   
        }
        System.out.println("DONE");
        
    }
    /**
     * @param done the done to set
     */
    public void setDone(boolean done) {
        this.done = done;
    }
    
    
}
