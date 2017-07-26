package com.planck.etf2l4j.utils.response;

import com.google.gson.annotations.Expose;

public class Status {

    @Expose
    private int code;
    @Expose
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
