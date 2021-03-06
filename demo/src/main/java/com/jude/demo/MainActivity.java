package com.jude.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jude.swipbackhelper.SwipeBackHelper;


public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeBackHelper.getCurrentPage(this).setSwipeBackEnable(false);
        findViewById(R.id.container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

}
