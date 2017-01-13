package com.code19.moneta;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.code19.monetaui.interfaces.IDialogInterface;
import com.code19.monetaui.utils.ToastUtils;
import com.code19.monetaui.widget.CountDownView;
import com.code19.monetaui.utils.DialogUtils;

public class MainActivity extends AppCompatActivity {

    private CountDownView mCdvtimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCdvtimer = (CountDownView) findViewById(R.id.cdv_countdown);
        Button btnstartcountdown = (Button) findViewById(R.id.btn_start_countdown);
        btnstartcountdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCdvtimer.start();
            }
        });

        ((Button) findViewById(R.id.btn_alert_dialog)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogUtils.showDialog(MainActivity.this, "message", "title", "cancel", "Ok", new IDialogInterface() {
                    @Override
                    public void onCancelClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }

                    @Override
                    public void onOKClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        });
        ((Button) findViewById(R.id.btn_alert_toast)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.showToast("测试弹出吐司");
            }
        });

    }
}
