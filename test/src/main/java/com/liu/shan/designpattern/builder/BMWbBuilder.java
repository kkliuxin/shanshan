package com.liu.shan.designpattern.builder;

import java.util.List;

/**
 * Created by BBF on 2016/11/17.
 */
public class BMWbBuilder extends CardBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CardModel getCardModel() {
        return bmwModel;
    }
}
