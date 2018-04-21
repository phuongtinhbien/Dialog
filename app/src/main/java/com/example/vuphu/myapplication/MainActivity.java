package com.example.vuphu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notify(View view) {
        notify notify = new notify(MainActivity.this);
        notify.show();
    }

    public void confirm(View view) {
        confirm confirm = new confirm(MainActivity.this);
        confirm.show();
    }
}
