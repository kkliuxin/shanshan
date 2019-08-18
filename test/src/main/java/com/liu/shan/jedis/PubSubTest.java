package com.liu.shan.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by liuxin on 2017/7/10.
 */
public class PubSubTest {

    public static void main(String[] args) {
        String cmd = "232";
        System.out.println("redis start");
        Jedis jedis = new Jedis("localhost");
//        try {
//            Socket socket = new Socket("127.0.0.1", 6379);
//            InputStream in = socket.getInputStream();
//            OutputStream out = socket.getOutputStream();
//            out.write(cmd.getBytes()); //发送订阅命令
//            byte[] buffer = new byte[1024];
//            while (true) {
//                int readCount = in.read(buffer);
//                System.out.write(buffer, 0, readCount);
//                System.out.println("--------------------------------------");
//            }
//        } catch (Exception e) {
//        }
    }
}
