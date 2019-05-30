package com.example.hp.androidlab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.hp.androidlab4.adapter.FilmAdapter;
import com.example.hp.androidlab4.model.Film;

import java.util.ArrayList;
import java.util.List;

public class Bai3Activity extends AppCompatActivity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        lv = findViewById(R.id.lv);
        List<Film> filmList = new ArrayList<>();

        for (int i=1;i<21;i++){
            Film film= new Film();
            film.setName("Avengers: End Game "+ i);
            film.setTime("2019");

            filmList.add(film);
        }

        FilmAdapter adapter = new FilmAdapter(Bai3Activity.this,filmList);
        lv.setAdapter(adapter);
    }
}
