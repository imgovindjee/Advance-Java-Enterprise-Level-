package com.company;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLconnections {
    public static void main(String[] args){
        try {
            URL url = new URL("https://www.youtube.com/watch?v=2pQPtAYqt0k");

            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            int i;
            while((i=inputStream.read())!=-1){
                System.out.print((char) i);
            }
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
