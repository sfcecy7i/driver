package com.cmos.driver.face;

import android.graphics.Bitmap;

public interface Compare {
    /**
     * 从图片里抽取人脸特征值
     * imageData为相机预览ImageFormat.NV21格式的数据
     * @param imageData
     * @return 特征值数据
     */
    byte[] extractFeature(byte[] imageData, FaceInfo faceInfo);

    /**
     * @param image jpeg格式
     * @return
     */
    byte[] extractFeature(Bitmap image);

    /**
     * @param image jpeg格式
     * @return 全部人脸的特征值，按距离排序（与图像中心点为参照点）
     */
    byte[][] extractAllFeatureByDistance(Bitmap image);

    /**
     * @param image jpeg格式
     * @return 全部人脸的特征值，按人脸大小排序
     */
    byte[][] extractAllFeatureByArea(Bitmap image);

    /**
     * 比较两个特征值
     *
     * @param feature1
     * @param feature2
     * @return 比对分值，满分100
     */
    int compareFeature(byte[] feature1, byte[] feature2);

    /**
     * 比较两张图片里的最优人像
     *
     * @param image1
     * @param image2
     * @return 比对分值，满分100
     */
    int compareImage(Bitmap image1, Bitmap image2);

    void release();
}
