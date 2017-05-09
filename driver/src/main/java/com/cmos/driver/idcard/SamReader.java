package com.cmos.driver.idcard;

/**
 * 带SAM模块的身份证读卡器驱动接口
 */
public interface SamReader {
    /**
     * 打开读卡器，初始化资源
     */
    void open();

    /**
     * 恢复资源，根据需要实现
     */
    void resume();

    /**
     * 读身份证。注意：
     * 成功：
     * 需要设置 IdCard.setSuccess(true);
     * 失败：
     * 需要设置 IdCard.setSuccess(false);
     *         IdCard.setError("失败原因");
     * @see IdCard#setSuccess(boolean) 设置是否成功
     * @see IdCard#setError(String) 设置失败原因
     * @return
     */
    IdCard read();

    /**
     * 挂起资源，根据需要实现
     */
    void pause();

    /**
     * 关闭读卡器，释放资源
     */
    void close();
}
