package com.planck.etf2l4j.utils.recruitment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageInfo {

    @Expose
    @SerializedName("entries_per_page")
    private int entries;

    @Expose
    @SerializedName("page")
    private int pageNumber;

    @Expose
    @SerializedName("total_pages")
    private int totalPages;

    public int getEntries() {
        return entries;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getTotalPages() {
        return totalPages;
    }
}
