package com.code19.monetaui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Chronometer;

import com.code19.monetaui.R;

/**
 * Created by ghost on 2017/1/14.
 * 倒计时控件
 */

public class CountDownView extends Chronometer {
    private int mTime;
    private int mHourTime = 60 * 60;

    public CountDownView(Context context) {
        this(context, null);
    }

    public CountDownView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CountDownView);
        mTime = typedArray.getInt(R.styleable.CountDownView_init_time, 0);
        this.setOnChronometerTickListener(listener);
        typedArray.recycle();
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(int time) {
        mTime = time;
    }

    /**
     * 停止计时
     */
    public void stopTime() {
        this.mTime = 0;
        this.stop();
    }

    /**
     * 暂停倒计时
     */
    public void pauseTime() {
        this.pauseTime();
    }

    /**
     * 继续倒计时
     */
    public void resumeTime() {
        this.start();
    }

    /**
     * 倒计时结束回掉
     */
    public void setOnCountDownListener(OnCountDownListener onCountDownListener) {
        mOnCountDownListener = onCountDownListener;
    }

    /**
     * 倒计时监听
     */
    OnChronometerTickListener listener = new OnChronometerTickListener() {
        @Override
        public void onChronometerTick(Chronometer chronometer) {
            chronometer.setText(formatMiss());
        }
    };

    private String formatMiss() {
        String value = "00";
        if (mTime >= mHourTime) {
            if (mTime <= 0) {
                this.stop();
                value = "00:00:00";
                if (mOnCountDownListener != null) {
                    mOnCountDownListener.setViewListner();
                }
            } else {
                mTime--;
                long s = mTime % 60;
                long m = (mTime - s) / 60 % 60;
                long h = (mTime - s - m) / 3600;
                value = setZero(h) + ":" + setZero(m) + ":" + setZero(s);
            }
        } else {
            if (mTime <= 0) {
                this.stop();
                value = "00:00";
                if (mOnCountDownListener != null) {
                    mOnCountDownListener.setViewListner();
                }
            } else {
                mTime--;
                long s = mTime % 60;
                long m = (mTime - s) / 60 % 60;
                value = setZero(m) + ":" + setZero(s);
            }
        }
        return value;
    }

    private String setZero(long time) {
        if (time < 10) {
            return "0" + time;
        } else if (time < 0) {
            return "00";
        } else {
            return "" + time;
        }
    }


    OnCountDownListener mOnCountDownListener;

    interface OnCountDownListener {
        void setViewListner();
    }
}
