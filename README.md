# Moneta 封装常用UI

### com.code19.monetaui.base  基类

* ListFragmentsAdapter Fragment的Adapter

### com.code19.monetaui.handler handler相关类
* crash
    * CrashHandler 应用程序崩溃处理相关类
    * CrashHandler.getInstance().init(getApplicationContext());

### com.code19.monetaui.interfaces 回调接口
* IDialogInterface 对话框工具类回调

### com.code19.monetaui.utils  控件工具类

* DialogUtils 对话框相关的工具类
* ImageLoaderUtils 图片请求框架Glide封装工具类
* ToastUtils 吐司工具类
* SnackBarUtils SnackBar工具类

### com.code19.monetaui.widiget  自定义控件

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

### drawable 目录

* divider的使用方法
```
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:divider="@drawable/divider"
    android:orientation="vertical"
    android:showDividers="middle">
</LinearLayout>
android:showDividers="middle"
android:divider="@drawable/divider"
以上2条属性就是现实divider的方式
```
