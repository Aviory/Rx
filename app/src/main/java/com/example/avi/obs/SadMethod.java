package com.example.avi.obs;

/**
 * Created by avi on 16.02.18.
 */

class SadMethod implements AbstractMethod {
    @Override
    public FactoryProduct getEmotion() {
        return new SadEmotionProduct();
    }

}
