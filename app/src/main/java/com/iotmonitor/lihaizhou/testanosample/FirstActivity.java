package com.iotmonitor.lihaizhou.testanosample;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWindow().setExitTransition(null);
                getWindow().setEnterTransition(null);
                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(FirstActivity.this,floatingActionButton,floatingActionButton.getTransitionName());
                Bundle bundle = activityOptions.toBundle();
                startActivity(new Intent(FirstActivity.this,SecondActivity.class),bundle);
            }
        });
    }
}
