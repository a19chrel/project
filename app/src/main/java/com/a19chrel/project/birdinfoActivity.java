package com.a19chrel.project;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class birdinfoActivity extends AppCompatActivity {

    private ArrayList<String> birdInfo = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birdinfo);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String quantity = extras.getString("quantity");
            String category = extras.getString("category");
            String pictureUrl = extras.getString("pictureUrl");

            birdInfo.add("Namn: " + name);
            birdInfo.add("Antal i Sverige: " + quantity);
            birdInfo.add("Fågelfamilj: " + category);

            ImageView img = findViewById(R.id.birdinfo_imageview);
            Picasso.get().load(pictureUrl).into(img);

            adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.listview_layout,R.id.listitem,birdInfo);
            ListView mylistview = findViewById(R.id.birdinfo_listview);
            mylistview.setAdapter(adapter);

        }

        Button btn = findViewById(R.id.button_birdinfo_back);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       finish();
                                   }
                               }
        );
    }
}