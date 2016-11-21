package com.liu.shan.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by BBF on 2016/11/18.
 */
public class ProxyClient {

    public static void main(String[] args) {
//        IGamePlayer gamePlayer = new GamePlayer("王麻子");
//        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
//        gamePlayerProxy.login("老王","password");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.upgrade();

        IGamePlayer player = new GamePlayer("王麻子");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(handler.getClass().getClassLoader(),player.getClass().getInterfaces(), handler);
        proxy.login("老王" , "password");
        proxy.killBoss();
        proxy.upgrade();


    }
}
