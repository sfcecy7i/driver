package com.cmos.driver;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Result implements Serializable, Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.success ? (byte) 1 : (byte) 0);
        dest.writeString(this.errorMsg);
    }

    public Result() {}

    private Result(Parcel in) {
        this.success = in.readByte() != 0;
        this.errorMsg = in.readString();
    }

    public static final Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel source) {
            return new Result(source);
        }

        @Override
        public Result[] newArray(int size) {
            return new Result[size];
        }
    };
}
