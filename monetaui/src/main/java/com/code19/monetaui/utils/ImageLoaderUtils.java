package com.code19.monetaui.utils;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.io.File;

/**
 * 封装Glider框架加载图片
 */

public class ImageLoaderUtils {

    /**
     * 以下三个方法适合在onDestroy方法处调用
     * 取消图片请求
     *
     * @param iv
     */
    public static void clearImageView(ImageView iv) {
        Glide.clear(iv);
    }

    public static void clearImageView(FutureTarget target) {
        Glide.clear(target);
    }

    public static void clearImageView(Target target) {
        Glide.clear(target);
    }

    /**
     * 显示圆角图片
     *
     * @param context
     * @param url
     * @param iv
     */
    public static void intoWithCircle(Context context, String url, ImageView iv) {
        File file = new File(url);
        if (file.exists()) {
            Glide.with(context).load(file).centerCrop().transform(new GlideCircleTransform(context)).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
        } else {
            Glide.with(context).load(url).centerCrop().transform(new GlideCircleTransform(context)).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
        }
    }

    /**
     * 显示圆角图片
     *
     * @param context
     * @param file
     * @param iv
     */
    public static void intoWithCircle(Context context, File file, ImageView iv) {
        Glide.with(context).load(file).centerCrop().transform(new GlideCircleTransform(context)).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
    }


    /**
     * 显示非圆角图片
     *
     * @param context
     * @param url     可以是本地路径或者网络图片地址
     * @param iv
     */
    public static void into(Context context, String url, ImageView iv) {
        File file = new File(url);
        if (file.exists()) {
            Glide.with(context).load(file).into(iv);
        } else {
            Glide.with(context).load(url).into(iv);
        }
    }

    public static void into(Context context, String url, ImageView iv, int error) {
        if (url == null) {
            url = "";
        }
        File file = new File(url);
        if (file.exists()) {
            Glide.with(context).load(file).error(error).into(iv);
        } else {
            Glide.with(context).load(url).error(error).into(iv);
        }
    }

    public static void into(Context context, int url, ImageView iv) {
        Glide.with(context).load(url).into(iv);
    }

    /**
     * 显示非圆角图片
     *
     * @param context
     * @param url        可以是本地路径或者网络图片地址
     * @param iv
     * @param placehoder
     */
    public static void intoCenterCrop(Context context, String url, ImageView iv, int placehoder) {
        File file = new File(url);
        if (file.exists()) {
            Glide.with(context).load(file).centerCrop().into(iv);
        } else {
            Glide.with(context).load(url).centerCrop().into(iv);
        }
    }


    /**
     * 显示非圆角图片
     *
     * @param context
     * @param url     可以是本地路径或者网络图片地址
     * @param iv
     */
    public static void intoCenterCrop(Context context, String url, ImageView iv, RequestListener loadListener) {
        File file = new File(url);
        if (file.exists()) {
            Glide.with(context).load(file).asBitmap().centerCrop().into(iv);
        } else {
            Glide.with(context).load(url).asBitmap().centerCrop().listener(loadListener).into(iv);
        }
    }


    /**
     * 显示非圆角图片
     *
     * @param context
     * @param url
     * @param iv
     */
    public static void intoCenterCrop(Context context, String url, ImageView iv) {
        Glide.with(context).load(url).centerCrop().into(iv);
    }

    public static void intoCenterCropForUrl(Context context, String url, ImageView iv, RequestListener loadListener) {
        Glide.with(context).load(url).centerCrop().listener(loadListener).into(iv);
    }

    /**
     * 显示非圆角图片
     *
     * @param context
     * @param url
     * @param iv
     */
    public static void intoDefault(Context context, String url, ImageView iv) {
        Glide.with(context).load(url).into(iv);
    }

    /**
     * 显示非圆角图片
     *
     * @param context
     * @param uri
     * @param iv
     */
    public static void intoCenterCrop(Context context, Uri uri, ImageView iv) {
        Glide.with(context).load(uri).centerCrop().into(iv);
    }

    /**
     * 显示非圆角图片
     *
     * @param context
     * @param url
     * @param iv
     */
    public static void intoFit(Context context, String url, ImageView iv) {
        File file = new File(url);
        if (file.exists()) {
            Glide.with(context).load(file).asBitmap().fitCenter().into(iv);
        } else {
            Glide.with(context).load(url).asBitmap().fitCenter().into(iv);
        }
    }


    public static void intoWithCircle(Context context, String url, ImageView iv, RequestListener loadListener) {
        File file = new File(url);
        if (file.exists()) {
            Glide.with(context).load(file).asBitmap().centerCrop().transform(new GlideCircleTransform(context)).listener(loadListener).into(iv);
        } else {
            Glide.with(context).load(url).centerCrop().transform(new GlideCircleTransform(context)).listener(loadListener).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
        }
    }

    public static void intoCenterCrop(Context context, String url, ImageView iv, Transformation Transformation) {
        Glide.with(context).load(url).bitmapTransform(Transformation).into(iv);
    }

    public static void intoCenterCrop(Context context, String url, ImageView iv, Transformation... Transformation) {
        Glide.with(context).load(url).bitmapTransform(Transformation).into(iv);
    }
}
