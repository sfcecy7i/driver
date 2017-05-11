package com.cmos.driver;


public class Result {
    private boolean success;
    private String errorMsg;

    private Result(boolean success, String errorMsg) {
        this.success = success;
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public static Result SUCCESS() {
        return new Result(true, null);
    }

    public static Result FAILURE(String errorMsg) {
        return new Result(false, errorMsg);
    }
}
