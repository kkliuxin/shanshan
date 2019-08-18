package com.liu.shan.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BBF on 2016/11/17.
 */
public class CarDirector {

    private List<String> sequence = new ArrayList<>();

    private BenzBuilder benzBuilder = new BenzBuilder();

    private BMWbBuilder bmWbBuilder = new BMWbBuilder();

    public BenzModel getBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCardModel();
    }

    public BMWModel getBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmWbBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmWbBuilder.getCardModel();
    }

 }
