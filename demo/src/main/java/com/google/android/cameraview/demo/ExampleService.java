package com.google.android.cameraview.demo;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Machinatron on 2017-07-14.
 */

public class ExampleService extends IntentService {
    private static final String TAG = "EXAMPLESERVICE";

    public static Intent newIntent(Context context){
        return new Intent(context, ExampleService.class);
    }

    public ExampleService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "This has started");
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent,flags,startId);
    }
}
