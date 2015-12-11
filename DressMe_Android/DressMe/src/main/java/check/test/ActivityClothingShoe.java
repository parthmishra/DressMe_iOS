package check.test;

import android.app.ListActivity;
import android.app.Activity;
import android.app.ListActivity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


///Displays all current saved clothe layouts.

public class ActivityClothingShoe extends Activity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_clothing_shoe);

        /// Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_shoe);

        /// Defined Array values to show in ListView
        String[] values = new String[] {
                "First Shoe",
                "Second Shoe",
                "Third Shoe",
                "Fourth Shoe",
                "Fifth Shoe",
                "Sixth Shoe",
                "Seventh Shoe"
        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                /// ListView Clicked item index
                int itemPosition = position;

                /// ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                /// Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}