package com.example.hp.androidlab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KetQuaActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        textView =  findViewById(R.id.tvKetQua);

        Bundle bd = getIntent().getExtras();
        if (bd != null){
            String kq =  bd.getString("kq");
            textView.setText(kq);
        }
    }

    public void KqBack(View view) {
        Intent i = new Intent(KetQuaActivity.this,TinhBcnnActivity.class);
        startActivity(i);
        finish();
    }
}
