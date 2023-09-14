package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    //purpose: control viec ve man hinh nao, back ve home, chu dong luu cache man hinh
    Intent intent = new Intent(SecondActivity.this, MainActivity.class);
    startActivity(intent);
    }
}