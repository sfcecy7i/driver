package com.cmos.driver.face;

/**
 * imageData为相机预览ImageFormat.NV21格式的数据
 */
public interface Detect {
    /**
     * 图像质量选项
     */
    int OPTION_QUALITY = 0x01;
    /**
     * 人脸位置矩形框选项
     */
    int OPTION_POSITION_RECT = 0x02;
    /**
     * 人脸关键点选项
     */
    int OPTION_KEY_POINTS = 0x04;

    /**
     * 检测图像中是否有人脸
     * @param imageData 图像数据
     * @return 有人脸返回true，否则返回false
     */
    boolean detect(byte[] imageData);

    /**
     * 分析图像，选取最优人脸的单个人脸
     * @param imageData 图像数据
     * @param options 可传多个，比如：OPTION_QUALITY | OPTION_POSITION_RECT | OPTION_KEY_POINTS
     * @return FaceInfo
     * @see Detect#OPTION_QUALITY 图像质量选项
     * @see Detect#OPTION_POSITION_RECT 人脸位置矩形框选项
     * @see Detect#OPTION_KEY_POINTS 人脸关键点选项
     * @see FaceInfo
     */
    FaceInfo analyze(byte[] imageData, int options);

    /**
     * 分析图像，返回全部人脸信息，按距离排序（与图像中心点为参照点）
     * @param imageData 图像数据
     * @param options 可传多个，比如：OPTION_QUALITY | OPTION_POSITION_RECT | OPTION_KEY_POINTS
     * @return FaceInfo
     * @see Detect#OPTION_QUALITY 图像质量选项
     * @see Detect#OPTION_POSITION_RECT 人脸位置矩形框选项
     * @see Detect#OPTION_KEY_POINTS 人脸关键点选项
     * @see FaceInfo
     */
    FaceInfo[] analyzeByDistance(byte[] imageData, int options);

    /**
     * 分析图像，返回全部人脸信息，按人脸大小排序
     * @param imageData 图像数据
     * @param options 可传多个，比如：OPTION_QUALITY | OPTION_POSITION_RECT | OPTION_KEY_POINTS
     * @return FaceInfo
     * @see Detect#OPTION_QUALITY 图像质量选项
     * @see Detect#OPTION_POSITION_RECT 人脸位置矩形框选项
     * @see Detect#OPTION_KEY_POINTS 人脸关键点选项
     * @see FaceInfo
     */
    FaceInfo[] analyzeByArea(byte[] imageData, int options);

    void release();
}
