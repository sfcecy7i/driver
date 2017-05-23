package com.cmos.driver.face;


import android.graphics.Point;
import android.graphics.Rect;

public interface FaceInfo {
    /**
     * 图像质量，满分100
     */
    float getScore();

    /**
     * 人脸在图像中的位置，以矩形表示
     */
    Rect getPosition();

    /**
     * 人脸关键点的位置，以数组来表示
     */
    Point[] getKeyPoints();
}
