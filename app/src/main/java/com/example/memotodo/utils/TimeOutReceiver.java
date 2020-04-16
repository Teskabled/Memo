package com.example.memotodo.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.memotodo.activities.TemporaryTaskActivity;

public class TimeOutReceiver extends BroadcastReceiver {
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onReceive(Context context, Intent intent) {
        if(null== TemporaryTaskActivity.mInstance){
            Intent i = new Intent(context,TemporaryTaskActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.putExtra("notification",true);
            context.startActivity(i);
        }
        else{
            TemporaryTaskActivity.mInstance.requireNotification();
        }
    }
}
