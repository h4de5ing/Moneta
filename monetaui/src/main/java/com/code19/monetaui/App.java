package com.code19.monetaui;

import android.app.Application;

/**
 * Created by ghost on 2017/1/14.
 */

public class App extends Application {
    private static App application = null;

    public static App getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
