package com.example.memotodo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.memotodo.R;
import com.example.memotodo.utils.UserUtils;
import com.example.memotodo.views.InputView;

//NavagationBar
public class LoginActivity extends BaseActivity {

    private InputView mInputPhoneNumber, mInputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }
    //初始化
    private void initView(){
        initNavBar(false,"登录",false);
        mInputPhoneNumber = fd(R.id.input_phoneNumber);
        mInputPassword = fd(R.id.input_password);
    }
    //跳转注册页面点击事件
    public void onRegisterClick(View v){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    //登录按钮的点击事件
    public void onCommitClick(View v){
        String phoneNumber = mInputPhoneNumber.getInputStr();
        String password = mInputPassword.getInputStr();
       /* //用户输入未通过验证
        if(!UserUtils.isLoginValide(this, phoneNumber, password)){
            return;
        }*/
        //通过验证后跳转至MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
