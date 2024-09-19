package com.company;
import java.net.URL;
import java.io.*;


public class URLClass {
    public static void main(String[] args){
        try {
            URL url = new URL("https://www.youtube.com/watch?v=2pQPtAYqt0k");
            System.out.println("Port Number:- "+url.getPort());
            System.out.println("Host Name:- "+url.getHost());
            System.out.println("File Name:- "+url.getFile());
            System.out.println("Protocol:- "+url.getProtocol());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
