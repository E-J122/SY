package cn.edu.scujcc.sy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button skipButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Animation alpha = new AlphaAnimation(1.0f,1.0f);
        alpha.setRepeatCount(0);
        alpha.setDuration(6000);
        View v = View.inflate(this,R.layout.activity_welcome,null);
        setContentView(v);
        v.startAnimation(alpha);

        alpha.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) { }
            @Override
            public void onAnimationEnd(Animation animation) {
                //动画结束时，跳转到主界面
                redirectTo();
            }
            @Override
            public void onAnimationRepeat(Animation animation) { }
        });
        skipButton = findViewById(R.id.skip);
        skipButton.setOnClickListener(p -> {
            redirectTo();
        });
    }
    private void redirectTo() {
        Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
