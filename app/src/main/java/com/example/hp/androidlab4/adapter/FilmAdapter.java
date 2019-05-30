package com.example.hp.androidlab4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.androidlab4.R;
import com.example.hp.androidlab4.model.Film;

import java.util.List;

public class FilmAdapter extends BaseAdapter{

    private Context context;
    private List<Film> filmList;
    public FilmAdapter(Context context, List<Film> filmList){
        this.filmList = filmList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return filmList.size();
    }

    @Override
    public Object getItem(int position) {
        return filmList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvTime = convertView.findViewById(R.id.tvTime);
        ImageView ivFilm = convertView.findViewById(R.id.ivFlim);

        Button btn = convertView.findViewById(R.id.btnWatch);

        final Film film = (Film) getItem(position);
        tvName.setText(film.getName());
        tvTime.setText(film.getTime());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, film.getName(),Toast.LENGTH_SHORT).show();
                filmList.remove(position);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }
}
