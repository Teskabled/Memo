package com.example.memotodo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.memotodo.R;
import com.example.memotodo.utils.UserUtils;
import com.example.memotodo.views.InputView;

public class RegisterActivity extends BaseActivity {
    private InputView mInputPhoneNumber, mInputPassword, mInputPasswordConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }
    //初始化View
    private void initView(){
        initNavBar(true,"注册",false);
    }

    public void onRegisterClick(View v){
        String phoneNumber = mInputPhoneNumber.getInputStr();
        String password = mInputPassword.getInputStr();
        String passwordConfirm = mInputPasswordConfirm.getInputStr();
        //用户输入未通过验证
        if(!UserUtils.isLoginValide(this, phoneNumber, password)){
            return;
        }
        if(password != passwordConfirm){
            //Toast.makeText(this,"密码输入错误")
        }
        //通过验证后跳转至MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
