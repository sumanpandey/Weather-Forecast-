package com.example.sumankumarpandey.weather;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by SUMAN KUMAR PANDEY on 21-03-2018.
 */
public class WeatherAdapter extends ArrayAdapter<Weather> {

    public WeatherAdapter(Context context, ArrayList<Weather> weatherArrayList) {

        super(context,weatherArrayList);
    }
    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView,@NonNull ViewGroup parent){
        Weather weather =getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        TextView dateTextView =convertView.findViewById(R.id.tvDate);
        TextView minTextView =convertView.findViewById(R.id.tvLowTemperature);
        TextView maxTextView =convertView.findViewById(R.id.tvHighTemperature);
        TextView linkTextView =convertView.findViewById(R.id.tvLink);

        dateTextView.setText(weather.getDate());
        minTextView.setText(weather.getMinTemp());
        minTextView.setText(weather.getMaxTemp());
        linkTextView.setText(weather.getLink());

        return convertView;

    }
}
