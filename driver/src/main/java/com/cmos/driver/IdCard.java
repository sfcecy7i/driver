package com.cmos.driver;

import java.io.Serializable;

public class IdCard implements Serializable {
    /**
     * 是否读取成功
     */
    private boolean success;
    /**
     * 读取失败时的错误信息
     */
    private String error;
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

    private String getNonNullString(String source) {
        if (source == null) return "";
        else return source.replaceAll("\\s", "");
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
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
}
