package com.cmos.driver.idcard;

import com.cmos.driver.Result;

/**
 * 带SAM模块的身份证读卡器驱动接口
 */
public interface SamReader {
    /**
     * 打开读卡器，初始化资源
     */
    Result open();

    /**
     * 恢复资源，根据需要实现
     */
    Result resume();

    /**
     * 读身份证。注意：
     * 成功：
     * 需要设置 IdCard.setResult(Result.SUCCESS());
     * 失败：
     * 需要设置 IdCard.setSuccess(Result.FAILURE("失败原因");
     * @see IdCard#setResult(Result)  设置是否成功
     * @return
     */
    IdCard read();

    /**
     * 挂起资源，根据需要实现
     */
    Result pause();

    /**
     * 关闭读卡器，释放资源
     */
    Result close();
}
