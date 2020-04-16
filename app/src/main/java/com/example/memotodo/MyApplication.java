package com.example.memotodo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;
import com.example.memotodo.utils.SpUtils;

//在activity之间数据传递中比较实用的方式，用来存储系统的一些信息
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        SpUtils.init(this);
    }
}
