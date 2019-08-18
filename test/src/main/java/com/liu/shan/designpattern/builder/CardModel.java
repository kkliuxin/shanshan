package com.liu.shan.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BBF on 2016/11/17.
 */
public abstract class CardModel {
    private List<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String action = sequence.get(i);
            switch (action) {
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engine boom":
                    this.engineBoom();
            }
        }
    }

    public List<String> getSequence() {
        return sequence;
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
