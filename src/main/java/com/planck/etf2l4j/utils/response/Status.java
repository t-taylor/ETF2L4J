package com.planck.etf2l4j.utils.response;

public class Status {

    private int code;
    private String message;

    /**
     * Returns status code
     * @return Status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns status message
     * @return Status message
     */
    public String getMessage() {
        return message;
    }
}
