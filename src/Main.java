import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9025);
        Socket clientSocket = serverSocket.accept();
        PrintWriter  out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader  in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("New connection accepted");
        final String name = in.readLine();
        out.printf("Hi %s, your port is %d%n", name, clientSocket.getPort());
    }
}
