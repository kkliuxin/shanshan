package com.liu.shan.jedis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by liuxin on 2017/7/2.
 */
public class Test1 {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.auth("mima");
        jedis.append("ts", "dkdkd");

        System.out.println("ts " + jedis.getrange("ts", 0, 40));
        System.out.println();

    }

}

class Cat {
    String name;
    String code;

    public Cat(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}