package com.example.demo;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Ip {
    public static void main(String[] args) {
        InetAddress inetAddress;
        String ip;
        try {
            try(final DatagramSocket socket = new DatagramSocket()){
                socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
                ip = socket.getLocalAddress().getHostAddress();

                System.out.println("使用者名稱: " + System.getenv("USERNAME"));
                System.out.println("IP: " + ip);
            } catch (SocketException e) {
                e.printStackTrace();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
