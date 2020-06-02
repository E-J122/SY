package cn.edu.scujcc.sy;

public class VideoClip {
    private static final String TAG = "VideoClip";
    private String filePath;//视频路径
    private String workingPath;//输出路径
    private String outName;//输出文件名
    private double startTime;//剪切起始时间
    private double endTime;//剪切结束时间

    public void setFilePath(String filePath){
        this.filePath = filePath;
    }
    public void setWorkingPath(String workingPath) {
        this.workingPath = workingPath;
    }

    public void setOutName(String outName) {
        this.outName = outName;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }


}
