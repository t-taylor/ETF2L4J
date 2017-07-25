package com.planck.etf2l4j.utils.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class Status {

    public static Status parseJson(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, Status.class);
    }

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
