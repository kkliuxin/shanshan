package com.liu.shan.designpattern.builder;

import java.util.List;

/**
 * Created by BBF on 2016/11/17.
 */
public abstract class CardBuilder {
    public abstract void setSequence(List<String> sequence);

    public abstract CardModel getCardModel();
}
