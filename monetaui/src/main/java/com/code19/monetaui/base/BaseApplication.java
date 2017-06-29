package com.code19.monetaui.base;

import android.app.Application;

/**
 * Created by ghost on 2017/1/14.
 */

public class BaseApplication extends Application {
    private static BaseApplication application = null;

    public static BaseApplication getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
