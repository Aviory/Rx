package com.example.avi.obs;

/**
 * Created by avi on 16.02.18.
 */

class SadFactory implements AbstractFactory {
    @Override
    public FactoryProduct getEmotion() {
        return new SadEmotionProduct();
    }

    @Override
    public FactoryProduct getSymvol() {
        return new SadSymvolProduct();
    }
}
