package com.liu.shan.designpattern.builder;

/**
 * Created by BBF on 2016/11/17.
 */
public class Client {
    public static void main(String[] args) {
//        BenzModel benzModel = new BenzModel();
//        List<String> sequence = new ArrayList<String>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        benzModel.setSequence((ArrayList<String>) sequence);
//        benzModel.run();

        CarDirector carDirector = new CarDirector();
        BenzModel benzModel = carDirector.getBenzModel();
        benzModel.run();
        BMWModel bmwModel = carDirector.getBMWModel();
        bmwModel.run();


    }
}
