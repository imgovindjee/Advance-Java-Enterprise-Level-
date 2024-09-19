package com.company;

import java.net.HttpURLConnection;
import java.net.URL;

public class httpURLConnections {
    public static void main(String[] args){
        try {
            URL url = new URL("https://www.youtube.com/watch?v=2pQPtAYqt0k");

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            for(int i=0; i<8; i++) {
                System.out.println(urlConnection.getHeaderFieldKey(i) + "-" + urlConnection.getHeaderField(i));
            }
//            urlConnection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
