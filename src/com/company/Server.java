package com.company;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {

    public static ServerSocket serverSocket;

    public Server(int port) throws IOException{
        serverSocket = new ServerSocket(port);
    }

    public static void main(String[] args){
//        port
        int port = 3501;

        try {
            Server server = new Server(port);
            System.out.println("Waiting for the client on the port: "+ serverSocket.getLocalPort()+" ....");

            Socket socket = serverSocket.accept();
            System.out.println("Just connected to the Server: "+socket.getRemoteSocketAddress());

//            input operation
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            System.out.println(dataInputStream.readUTF());

//            input operation
            DataOutputStream dataOutputStream = new DataOutputStream((socket.getOutputStream()));
            dataOutputStream.writeUTF("Thank U for connecting "+socket.getLocalSocketAddress()+" bye......");

//            closing the connection
            socket.close();
            server.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
