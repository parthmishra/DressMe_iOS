package com.javatechig.imageview;

import check.test.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Favorites extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setting image resource from drawable
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.screen4);

        imageView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Clicked Second Image",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}