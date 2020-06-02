package cn.edu.scujcc.sy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button importButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        importButton = findViewById(R.id.import_video);
    }

    public void click(View view){
        Intent intent=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivity(intent);
    }
}
