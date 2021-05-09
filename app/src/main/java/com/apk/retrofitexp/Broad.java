package com.apk.retrofitexp;


import android.annotation.SuppressLint;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class Broad extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {


        //airoplainmode

       /* if(Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0)== 0)
        {
            Toast.makeText(context, "AIRPLANE MODE Off", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(context, "AIRPLANE MODE On", Toast.LENGTH_SHORT).show();
        }*/

    }
}
