package com.example.hp.androidlab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bai1(View view) {
        Intent intent = new Intent(MainActivity.this,TinhBcnnActivity.class);
        startActivity(intent);
    }

    public void Bai2(View view) {
        Intent intent = new Intent(MainActivity.this,Bai2Activity.class);
        startActivity(intent);
    }

    public void Bai3(View view) {
        Intent intent = new Intent(MainActivity.this,Bai3Activity.class);
        startActivity(intent);
    }
}
