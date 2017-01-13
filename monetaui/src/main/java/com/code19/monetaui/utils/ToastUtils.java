package com.code19.monetaui.utils;

import android.content.Context;

import com.code19.monetaui.App;
import com.code19.monetaui.widget.TipsToast;


/**
 * Created by ghost on 2016/8/13.
 */
public class ToastUtils {
    private static TipsToast toast;

    public static void showToast(Context context, int id) {
        if (toast == null) {
            toast = new TipsToast(context);
        }
        toast.setText(id);
        toast.show();
    }

    public static void showToast(Context context, String id) {
        if (toast == null) {
            toast = new TipsToast(context);
        }
        toast.setText(id);
        toast.show();
    }

    public static void showToast(String id) {
        if (toast == null) {
            toast = new TipsToast(App.getApplication());
        }
        toast.setText(id);
        toast.show();
    }

    public static void showToast(int id) {
        if (toast == null) {
            toast = new TipsToast(App.getApplication());
        }
        toast.setText(id);
        toast.show();
    }
}
