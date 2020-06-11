package cn.edu.scujcc.sy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;


import java.io.File;

/**
 * author KYX
 * 视频编辑界面
 * @param savedInstanceState
 */
@SuppressLint("NewApi")
public class EditActivity extends AppCompatActivity implements View.OnClickListener,ScrollViewListener {

    private int screenWidth;
    private int screenHeight;
    private String VideoPath;
    private VideoView mVideoView;
    private TextView VideoDuration;
    private ImageView Cut;
    private ImageView Delete;
    private ImageView merge;
    private boolean isPlaying=false;
    protected int Duration=0;//持续的时间
    private int mBottomLength=1;//底部长度
    private int DragPosition=0;//手势拖动的距离


    private Handler Handler = new Handler(){ //子线程
        @Override
        public void dispatchMessage(Message msg){
            super.dispatchMessage(msg);
            switch (msg.what){
                case 0://拖动更新
                    if(!mVideoView.isPlaying()&&!isPlaying){
                        //非播放状态
                        mVideoView.seekTo(DragPosition);//seekTo()方法的参数是毫秒
                    }
            }
        }
    };

    /**
     * Scroller 滑动监听
     * @param savedInstanceState
     *
     */
//    @Override
//    public void onScrollChanged(ObservableScrollView scrollView, int x, int y,
//                                int oldx, int oldy,boolean isByUser){
//
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//
        setContentView(R.layout.activity_edit);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//保持屏幕常亮
    }


    private boolean isEdit=false;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.return_button://返回按钮
                if (isEdit){
                    showTip();
                }else {
                    finish();
                }
        }
    }

    /**
     * 显示是否保存编辑的提示
     * AlertDialog 弹出对话框
     */
    private AlertDialog alertDialog;
    private void showTip() {
        if (alertDialog == null){
            alertDialog = new AlertDialog.Builder(this)
                    .create();
        }
        alertDialog.show();
        View tipView = View.inflate(this,R.layout.activity_edit,null);
    }


}
