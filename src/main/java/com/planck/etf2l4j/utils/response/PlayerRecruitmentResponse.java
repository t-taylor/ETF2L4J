package com.planck.etf2l4j.utils.response;

import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.recruitment.PageInfo;
import com.planck.etf2l4j.utils.recruitment.PlayerRecruitmentPost;

import java.util.ArrayList;
import java.util.List;

public class PlayerRecruitmentResponse {

    public PlayerRecruitmentResponse() {
        recPost = new ArrayList<>();
    }

    @SerializedName("page")
    private PageInfo info;

    @SerializedName("recruitment")
    private List<PlayerRecruitmentPost> recPost;

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
