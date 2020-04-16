package com.example.memotodo.activities;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.IdRes;

import com.example.memotodo.R;

//作为整个项目所有Activity的父类，用来描述所有Activity的共性
public class BaseActivity extends Activity {

    private ImageView mIvBack, mIvMe;
    private TextView mTvTitle;
    //接收一个资源的ID，然后返回一个T，T是view的子类
    protected <T extends View> T fd (@IdRes int id){

        return findViewById(id);
    }

    //初始化NavigationBar,左侧返回，中间标题，右侧显示自己
    protected void initNavBar(boolean isShowBack, String title, boolean isShowMe){
        mIvBack = fd(R.id.iv_back);
        mTvTitle = fd(R.id.tv_title);
        mIvMe = fd(R.id.iv_me);
        //看是否需要显示左右侧两个组件，显示中间组件
        mIvBack.setVisibility(isShowBack ? View.VISIBLE : View.GONE);
        mIvMe.setVisibility(isShowMe ? View.VISIBLE : View.GONE);
        mTvTitle.setText(title);
        //点击返回按钮事件
        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //点击个人中心按钮事件
        mIvMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this,MeActivity.class));
            }
        });

    }

}
