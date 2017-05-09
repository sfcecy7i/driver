package com.cmos.driver.face;


import android.graphics.PointF;
import android.graphics.RectF;

public class FaceInfo {
    int score;
    RectF position;
    PointF[] keyPoints;

    byte[] features;
}
