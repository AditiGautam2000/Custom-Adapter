package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listview;
String[] names = {"Liam","Olivia","Noah", "Emma","Oliver","Ava","William","Sophia","Elijah","Isabella","James","Char","Benjamin",
            "Amelia","Lucas","Mia","Mason","Harper","Ethan","Evelyn" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        Custom_Adapter adapter=new Custom_Adapter(this,R.layout.custom_layout,names);
        listview.setAdapter(adapter);
    }
}