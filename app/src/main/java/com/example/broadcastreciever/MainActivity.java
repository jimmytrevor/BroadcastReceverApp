package com.example.broadcastreciever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MyReceiver myReceiver = new MyReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter("com.example.resourcesapp.SendBroadCastMessage");
        registerReceiver(myReceiver,intentFilter);

    }
    @Override
    protected void onPause() {
        unregisterReceiver(myReceiver);
        super.onPause();
    }
}
