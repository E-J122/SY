package cn.edu.scujcc.sy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button shootButton,importButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shootButton = findViewById(R.id.shoot);
        shootButton.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this,ShootActivity.class);
            startActivity(intent);
        });
    }
}
