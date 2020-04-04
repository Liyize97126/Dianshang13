package com.bawei.dianshang13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //定义
    private Button pressEx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pressEx = findViewById(R.id.pressEx);
        //触发异常
        pressEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 1/0;
            }
        });
    }
}
