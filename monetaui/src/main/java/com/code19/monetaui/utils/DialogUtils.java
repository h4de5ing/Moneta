package com.code19.monetaui.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;

import com.code19.monetaui.interfaces.IDialogInterface;

/**
 * Created by ghost on 2017/1/14.
 */

public class DialogUtils {
    /**
     *
     * @param activity
     * @param message           提示内容
     * @param title             标题
     * @param Cancel            取消按钮文字
     * @param OK                确定按钮文字
     * @param mIDialogInterface 点击回调
     */
    public static void showDialog(Activity activity, String message, String title, String Cancel, String OK, final IDialogInterface mIDialogInterface) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        builder.setMessage(message);
        builder.setTitle(title);
        if (!TextUtils.isEmpty(Cancel)) {
            builder.setNegativeButton(Cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mIDialogInterface.onCancelClick(dialog, which);
                }
            });
        }

        if (!TextUtils.isEmpty(OK)) {
            builder.setPositiveButton(OK, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mIDialogInterface.onOKClick(dialog, which);
                }
            });
            builder.show();

        }
    }
}
