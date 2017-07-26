package com.planck.etf2l4j.utils.recruitment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.response.Status;

import java.util.ArrayList;
import java.util.List;

public class PlayerRecruitmentResponse {

    public PlayerRecruitmentResponse() {
        recPost = new ArrayList<>();
    }

    @Expose
    @SerializedName("page")
    private PageInfo info;

    @Expose
    @SerializedName("recruitment")
    private List<PlayerRecruitmentPost> recPost;

    @Expose
    private Status status;

    public PageInfo getInfo() {
        return info;
    }

    public List<PlayerRecruitmentPost> getRecPost() {
        return recPost;
    }

    public Status getStatus() {
        return status;
    }
}
