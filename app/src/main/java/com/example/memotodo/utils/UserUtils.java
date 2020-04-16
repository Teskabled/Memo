package com.example.memotodo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.service.autofill.RegexValidator;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.example.memotodo.R;
import com.example.memotodo.activities.LoginActivity;

public class UserUtils {
    //验证用户输入的合法性
    public static boolean isLoginValide(Context context, String phoneNumber, String password){
        //精确地验证输入手机号是否有效
        if(!RegexUtils.isMobileExact(phoneNumber)){
            Toast.makeText(context,"无效手机号！",Toast.LENGTH_LONG).show();
            return false;
        }
        //验证输入密码是否为空
        if(TextUtils.isEmpty(password)){
            Toast.makeText(context,"输入密码不能为空！",Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
    //退出登录
    public static void logout(Context context){
        Intent intent = new Intent(context, LoginActivity.class);
        //添加intent标志符,退出登录时清除任务栈,并新生成一个任务栈
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        //解决退出登录后由于清除栈造成的页面跳转动画混乱的现象，从而定义跳转动画，该方法必须在startActivity之后调用
        ((Activity)context).overridePendingTransition(R.anim.open_enter_anim,R.anim.open_exit_anim);
    }
}
