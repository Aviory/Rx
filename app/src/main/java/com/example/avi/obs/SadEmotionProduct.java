package com.example.avi.obs;

/**
 * Created by avi on 16.02.18.
 */

class SadEmotionProduct implements FactoryProduct {
    @Override
    public String get() {
        return "^(";
    }
}
