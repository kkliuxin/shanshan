package com.liu.shan.designpattern.proxy;

/**
 * Created by BBF on 2016/11/18.
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {

    private IGamePlayer iGamePlayer = null;

    public GamePlayerProxy(IGamePlayer iGamePlayer) {
        this.iGamePlayer = iGamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
        this.cout();
    }

    @Override
    public void cout() {
        System.out.println("收取费用100元");
    }
}
