package me.tsinling.aidl.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BinderPoolService extends Service {


    @Override
    public IBinder onBind(Intent intent) {
         return BinderPoolHelper.DEFAULT_IBINDER;
    }

}