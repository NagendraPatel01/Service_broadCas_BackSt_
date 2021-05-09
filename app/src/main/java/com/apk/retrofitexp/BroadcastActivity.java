package com.apk.retrofitexp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class BroadcastActivity extends AppCompatActivity {

    //airoplain
    /*Broad exampleBroadcastReceiver = new Broad();*/

    TextView text;
   Batterydata batteryReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);

        text=findViewById(R.id.text);

       batteryReceiver=new Batterydata(text);

        registerReceiver(batteryReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }

   /* @Override
    protected void onStart() {
        super.onStart();
        //airoplan
      *//*  IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(exampleBroadcastReceiver, filter);*//*
    }*/

    @Override
    protected void onStop(){
        super.onStop();/*
        unregisterReceiver(exampleBroadcastReceiver);*/

        unregisterReceiver(batteryReceiver);
    }

}