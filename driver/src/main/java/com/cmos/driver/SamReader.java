package com.cmos.driver;

/**
 * 带SAM模块的身份证读卡器驱动接口
 */
public interface SamReader {
    /**
     * 打开读卡器，资源初始化
     */
    void open();

    /**
     * 恢复资源，根据需要实现
     */
    void resume();

    /**
     * 读身份证
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
