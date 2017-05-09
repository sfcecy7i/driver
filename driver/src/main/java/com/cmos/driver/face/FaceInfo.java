package com.cmos.driver.face;


import android.graphics.PointF;
import android.graphics.RectF;

public class FaceInfo {
    /**
     * 图像质量，满分100
     */
    private int score;
    /**
     * 人脸在图像中的位置，以矩形表示
     */
    private RectF position;
    /**
     * 人脸关键点的位置，以数组来表示
     */
    private PointF[] keyPoints;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public RectF getPosition() {
        return position;
    }

    public void setPosition(RectF position) {
        this.position = position;
    }

    public PointF[] getKeyPoints() {
        return keyPoints;
    }

    public void setKeyPoints(PointF[] keyPoints) {
        this.keyPoints = keyPoints;
    }
}
