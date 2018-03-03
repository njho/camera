package com.google.android.cameraview;

/**
 * Created by Machinatron on 2017-09-16.
 */

public class Counter {
    private static int mCounter = 0;


    public void updateCounter() {
        mCounter++;
    }

    public Integer getCounter() {
        return mCounter;
    }

    public void resetCounter() {
        mCounter = 0;
    }

}
