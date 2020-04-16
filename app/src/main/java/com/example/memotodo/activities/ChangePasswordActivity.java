package com.example.memotodo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.memotodo.R;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        initView();

    }

    public void initView(){
        initNavBar(true,"修改密码", false);
    }
}
