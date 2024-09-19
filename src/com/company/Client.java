package com.company;
import java.io.*;
import  java.net.Socket;

public class Client {
    public static void main(String[] args){
//        port number and host
        String host = "localhost";
        int port = 3501;

        try {
            Socket socket = new Socket(host, port);
            System.out.println("Just connected to the:- "+socket.getRemoteSocketAddress());

            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello From "+socket.getLocalSocketAddress());

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("Server says \n"+dataInputStream.readUTF());

            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
