package com.liu.shan.designpattern.proxy;

/**
 * Created by BBF on 2016/11/18.
 */
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();
}
