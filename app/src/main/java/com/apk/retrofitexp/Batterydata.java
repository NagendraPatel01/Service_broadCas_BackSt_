package com.apk.retrofitexp;

import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.TextView;

public class Batterydata extends BroadcastReceiver {

    TextView text;
   public Batterydata(TextView text){

        this.text=text;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        int percantage=intent.getIntExtra("level",0);

        if (percantage!=0){

            text.setText(percantage+"%");
        }
    }
}
