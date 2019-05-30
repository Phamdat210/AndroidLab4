package com.example.hp.androidlab4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        Intent a= new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/uJqfgWENkdS35ZLL7"));
        startActivity(a);
    }
}
