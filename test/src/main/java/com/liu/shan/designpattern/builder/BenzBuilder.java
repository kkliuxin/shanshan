package com.liu.shan.designpattern.builder;


import java.util.List;

/**
 * Created by BBF on 2016/11/17.
 */
public class BenzBuilder extends CardBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CardModel getCardModel() {
        return benzModel;
    }
}
