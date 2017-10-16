package com.cmos.driver.idcard;

import android.os.Parcel;
import android.os.Parcelable;

import com.cmos.driver.Result;

import java.io.Serializable;

public class IdCard implements Serializable, Parcelable {
    private Result result;
    /**
     * 公民身份号码
     */
    private String cardNo;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 民族
     */
    private String ethnicity;
    /**
     * 出生，如20001010
     */
    private String birth;
    /**
     * 住址
     */
    private String address;
    /**
     * 签发机关
     */
    private String authority;
    /**
     * 有效日期，如20001010-20101010
     */
    private String period;
    /**
     * 解码后身份证头像
     */
    private byte[] avatar;
    /**
     * DN码
     */
    private String dn;
    private String uuid;
    private String timeTag;
    private String signStr;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    private String getNonNullString(String source) {
        if (source == null) return "";
        else return source.replaceAll("\\s", "");
    }

    public String getCardNo() {
        return getNonNullString(cardNo);
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return getNonNullString(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return getNonNullString(sex);
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return getNonNullString(ethnicity);
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getBirth() {
        return getNonNullString(birth);
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return getNonNullString(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAuthority() {
        return getNonNullString(authority);
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getPeriod() {
        return getNonNullString(period);
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getUuid() {
        return getNonNullString(uuid);
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTimeTag() {
        return getNonNullString(timeTag);
    }

    public void setTimeTag(String timeTag) {
        this.timeTag = timeTag;
    }

    public String getSignStr() {
        return getNonNullString(signStr);
    }

    public void setSignStr(String signStr) {
        this.signStr = signStr;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.result, flags);
        dest.writeString(this.cardNo);
        dest.writeString(this.name);
        dest.writeString(this.sex);
        dest.writeString(this.ethnicity);
        dest.writeString(this.birth);
        dest.writeString(this.address);
        dest.writeString(this.authority);
        dest.writeString(this.period);
        dest.writeByteArray(this.avatar);
        dest.writeString(this.dn);
        dest.writeString(this.uuid);
        dest.writeString(this.timeTag);
        dest.writeString(this.signStr);
    }

    public IdCard() {
    }

    private IdCard(Parcel in) {
        this.result = in.readParcelable(Result.class.getClassLoader());
        this.cardNo = in.readString();
        this.name = in.readString();
        this.sex = in.readString();
        this.ethnicity = in.readString();
        this.birth = in.readString();
        this.address = in.readString();
        this.authority = in.readString();
        this.period = in.readString();
        this.avatar = in.createByteArray();
        this.dn = in.readString();
        this.uuid = in.readString();
        this.timeTag = in.readString();
        this.signStr = in.readString();
    }

    public static final Creator<IdCard> CREATOR = new Creator<IdCard>() {
        @Override
        public IdCard createFromParcel(Parcel source) {
            return new IdCard(source);
        }

        @Override
        public IdCard[] newArray(int size) {
            return new IdCard[size];
        }
    };
}
