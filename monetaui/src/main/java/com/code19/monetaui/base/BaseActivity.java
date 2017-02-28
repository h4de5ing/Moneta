package com.code19.monetaui.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by ghost on 2017/2/28.
 */

public abstract class BaseActivity extends SupportActivity {
    protected Activity mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mContext = this;
        initEventAndData();
    }

    protected abstract int getLayout();

    protected abstract void initEventAndData();
}
