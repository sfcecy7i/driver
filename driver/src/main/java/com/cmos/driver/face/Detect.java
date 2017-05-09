package com.cmos.driver.face;


public interface Detect {
    int OPTION_QUALITY = 0x01;
    int OPTION_POSITION_RECT = 0x02;
    int OPTION_KEY_POINTS = 0x04;

    FaceInfo detect(byte[] imageData, int options);
}
