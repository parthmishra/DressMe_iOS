package com.nraboy.imagegrid;

import check.test.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.*;
import java.util.*;
import java.net.*;
import android.widget.*;
import android.content.DialogInterface.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import com.nraboy.imagegrid.ImageAdapter;
import com.nraboy.imagegrid.Main2Activity;


public class Main2Activity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Main2Activity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
        */
        String[] array = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        GridView grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, list));

    }

}
