package com.example.avi.obs.putterns;

/**
 * Created by avi on 09.02.18.
 */

class Request {
    private String message;

    public Request(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
