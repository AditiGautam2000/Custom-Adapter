package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Custom_Adapter extends ArrayAdapter<String> {
   private String []names;
    public Custom_Adapter(@NonNull Context context, int resource, @NonNull String[] names) {
        super(context, resource, names);
       this.names=names;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return names[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView=LayoutInflater.from(getContext()).inflate(R.layout.custom_layout,parent,false);
       TextView t= convertView.findViewById(R.id.textView);
       t.setText(getItem(position));

        return convertView;
    }
}

