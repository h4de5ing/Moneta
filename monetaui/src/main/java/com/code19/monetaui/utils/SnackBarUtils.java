package com.code19.monetaui.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by ghost on 2017/2/28.
 */

public class SnackBarUtils {
    public static void show(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }

    public static void showLong(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }
}
