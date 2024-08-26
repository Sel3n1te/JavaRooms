import java.net.ServerSocket;

public class Server {
    
    public void run(Integer port) {
        try {
            ServerSocket sS = new ServerSocket(port);
            
        } catch (Exception e) {
            System.out.println("Failed to open specified port. Please make sure it is not already in use or opened.");
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.run(6969);
    }
}
