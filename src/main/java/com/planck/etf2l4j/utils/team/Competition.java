package com.planck.etf2l4j.utils.team;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class Competition {

    private String category;
    @SerializedName("competition")
    private String title;
    private DivisionContainer division;

    public Competition parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, Competition.class);
    }

    private class DivisionContainer {

        public String name;
        public int tier;

        public DivisionContainer parseJSON(String response) {
            Gson gson = new GsonBuilder().create();
            return gson.fromJson(response, DivisionContainer.class);
        }

    }
}
