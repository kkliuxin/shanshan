package com.liu.shan;

import redis.clients.jedis.Jedis;

/**
 * Created by BBF on 2016/10/31.
 */
public class RedisTest {

    public static void main(String[] args) {
        try {
            Jedis jedis = new Jedis("localhost");
            System.out.println(jedis.ping());
//            jedis.auth("123");
//            jedis.set("foo","shanshan");
            String value = jedis.get("foo");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
