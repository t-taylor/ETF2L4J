package com.planck.etf2l4j.utils.recruitment;

import com.google.gson.annotations.Expose;

public class Comments {
    @Expose
    private int count;
    @Expose
    private int last;

    public int getCount() {
        return count;
    }

    public int getLast() {
        return last;
    }
}
