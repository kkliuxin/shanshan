package com.liu.shan.designpattern.factory;

/**
 * Created by BBF on 2016/11/14.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human balckHuman = humanFactory.createHuman(new BalckHuman().getClass());
        balckHuman.getColor();
        balckHuman.talk();
        Human yellowHuman = humanFactory.createHuman(new YellowHuman().getClass());
        yellowHuman.getColor();
        yellowHuman.talk();
        Human whiteHuman = humanFactory.createHuman(new WhiteHuman().getClass());
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
