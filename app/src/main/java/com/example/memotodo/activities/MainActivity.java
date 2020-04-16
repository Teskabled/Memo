package com.example.memotodo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.memotodo.R;
import com.example.memotodo.utils.UserUtils;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        initNavBar(false,"MemoToDo", true);
    }

    public void onStartTaskClick(View v){
        //通过验证后跳转至TaskActivity
        Intent intent = new Intent(this, TaskActivity.class);
        startActivity(intent);
        finish();

    }
}
