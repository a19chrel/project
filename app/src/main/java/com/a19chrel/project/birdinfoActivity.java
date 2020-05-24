package com.a19chrel.project;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
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
            int quantity = extras.getInt("quantity");
            String category = extras.getString("category");
            String pictureUrl = extras.getString("pictureUrl");

            birdInfo.add("Name: " + name);
            birdInfo.add("Quantity in sweden: " + quantity);
            birdInfo.add("Family: " + category);

            new DownloadImageTask((ImageView) findViewById(R.id.birdinfo_imageview))
                    .execute(pictureUrl);



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

    //Code by: Andriod Devoloper on StackOverflow
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}