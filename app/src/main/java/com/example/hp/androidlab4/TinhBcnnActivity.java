package com.example.hp.androidlab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TinhBcnnActivity extends AppCompatActivity {
    private EditText edSo1;
    private EditText edSo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_bcnn);

        edSo1 = (EditText) findViewById(R.id.edSo1);
        edSo2 = (EditText) findViewById(R.id.edSo2);
    }

    public void TinhBCNN(View view) {
        String so1 = edSo1.getText().toString();
        String so2 = edSo2.getText().toString();


        if (so1.equals("") || so2.equals("")){
            Toast.makeText(TinhBcnnActivity.this,"Không được nhập trống",Toast.LENGTH_SHORT).show();
        }else {
            int a = Integer.parseInt(so1);
            int b = Integer.parseInt(so2);
            if (a == b) {
                Toast.makeText(TinhBcnnActivity.this, "2 số không được trùng nhau", Toast.LENGTH_SHORT).show();
            }else if (a % b == 0){
                
            }else if (a > b) {
                int ucln = a - b;
                String bcnn = "BCNN là: " + (a * b) / ucln;
                Intent i = new Intent(TinhBcnnActivity.this, KetQuaActivity.class);
                i.putExtra("kq", bcnn);
                startActivity(i);
            } else if (a < b) {
                int ucln = b - a;
                String bcnn = "BCNN là: " + (a * b) / ucln;
                Intent i = new Intent(TinhBcnnActivity.this, KetQuaActivity.class);
                i.putExtra("kq", bcnn);
                startActivity(i);
            }
        }
    }

    public void TinhBack(View view) {
        Intent i = new Intent(TinhBcnnActivity.this,MainActivity.class);
        startActivity(i);
    }
}
