package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("MainActivity_log", "go to onCreate");
        Button btn = findViewById(R.id.btn_next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity_log", "go to onStart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity_log","go to onRestart");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity_log","go to onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity_log","go to onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity_log","go to onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity_log","go to onResume");

    }


}