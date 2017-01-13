package com.code19.monetaui.interfaces;

import android.content.DialogInterface;

/**
 * Created by ghost on 2017/1/14.
 */

public interface IDialogInterface {
    void onCancelClick(DialogInterface dialog, int which);

    void onOKClick(DialogInterface dialog, int which);
}
