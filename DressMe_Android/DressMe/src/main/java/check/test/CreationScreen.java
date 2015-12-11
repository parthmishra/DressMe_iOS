package check.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.view.Menu;
import android.view.MenuItem;

import com.nraboy.imagegrid.Main2Activity;


///Main screen for various functionality

/**
 * Contains Favorite, Weather, Add, Randomize, Upload toolbar functionality
 * Contains Four different visual clothe section user interfaces
 */
public class CreationScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_screen);

        ///Button to saved Top clothing array
        final ImageButton button_top = (ImageButton) findViewById(R.id.button_top);
        button_top.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), check.test.ActivityClothingTop.class);
                startActivity(i);
            }
        });
        ///Button to saved Accessory array
        final ImageButton button_accessory = (ImageButton) findViewById(R.id.button_accessory);
        button_accessory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), ActivityClothingAccessory.class);
                startActivity(i);
            }
        });
        ///Button to saved Legging clothing array
        final ImageButton button_legging = (ImageButton) findViewById(R.id.button_legging);
        button_legging.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), ActivityClothingLeggings.class);
                startActivity(i);
            }
        });
        ///Button to saved Shoe array
        final ImageButton button_shoe = (ImageButton) findViewById(R.id.button_shoe);
        button_shoe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), ActivityClothingShoe.class);
                startActivity(i);
            }
        });









       ///Button to Favorites Class
        final ImageButton button_favorite = (ImageButton) findViewById(R.id.favorite);
        button_favorite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Creation_Favorites.class);
                startActivity(i);
            }
        });

        ///Button to Weather Class
        final ImageButton button_weather = (ImageButton) findViewById(R.id.weather);
        button_weather.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Weather.class);
                startActivity(i);
            }
        });

        ///Button to Add Class
        final ImageButton button_add = (ImageButton) findViewById(R.id.add);
        button_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Creation_Add.class);
                startActivity(i);
            }
        });

        ///Button to Randomize Class
        final ImageButton button_randomize = (ImageButton) findViewById(R.id.randomize);
        button_randomize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });

        ///Button to Upload Class
        final ImageButton upload = (ImageButton) findViewById(R.id.upload);
        upload.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });


    }

    ///Creation of Options Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    ///Buttons to Profile Page and Settings
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        ///noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
