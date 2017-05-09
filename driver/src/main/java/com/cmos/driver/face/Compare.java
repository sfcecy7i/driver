package com.cmos.driver.face;


public interface Compare {
    /**
     * 从图片里抽取人脸特征值
     * @param imageData
     * @return 特征值数据
     */
    byte[] extractFeature(byte[] imageData);

    /**
     * 比较两个特征值
     * @param feature1
     * @param feature2
     * @return 比对分值，满分100
     */
    int compareFeature(byte[] feature1, byte[] feature2);

    /**
     * 比较两张图片里的人像
     * @param image1
     * @param image2
     * @return 比对分值，满分100
     */
    int compareImage(byte[] image1, byte[] image2);
}
