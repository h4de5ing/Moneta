# Moneta 自定义View UI库

# 对常用系统控件进行封装，实现调用更加简单

## How to use

- com.code19.monetaui.widiget  自定义控件

 这个包里面的控件均可以直接在xml布局中使用

* CountDownView 倒计时控件

```
<com.code19.monetaui.widiget.CountDownView
    android:id="@+id/cdv_countdown"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:gravity="center"
    android:textColor="@color/colorAccent"
    app:init_time="10"/>
```

- com.code19.monetaui.utils  控件工具类

 这个包里面的类是直接在Activity或者Fragment中直接调用

* DialogUtils 对话框相关的工具类
* GlideUtils Glide图片请求封装工具类
