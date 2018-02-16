package com.example.avi.obs;

/**
 * Created by avi on 16.02.18.
 */

class HappyFactory implements AbstractFactory {
    @Override
    public FactoryProduct getEmotion() {
        return new HappyEmotionProduct();
    }

    @Override
    public FactoryProduct getSymvol() {
        return new HappySmileProduct();
    }
}
