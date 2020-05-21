package com.a19chrel.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private String[] birdNames = {"Bird1", "Bird2", "Bird3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<>(getApplicationContext(),R.layout.listview_layout,R.id.listitem,birdNames);
        ListView mylistview = findViewById(R.id.listview);
        mylistview.setAdapter(adapter);

    }
}
