package check.test;

import android.os.Build;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageButton;
import android.content.Intent;

import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;


import android.util.Log;

import android.graphics.drawable.Drawable;
import android.graphics.Color;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), CreationScreen.class);
                startActivity(i);
            }
        });

    }



    //Opened by pressing Menu button. Can be modified to open other activities.

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Option1:
                Toast.makeText(this, R.string.menu_option1, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Option2:
                Toast.makeText(this, R.string.menu_option2, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Option3:
                Toast.makeText(this, R.string.menu_option3, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Option4:
                Toast.makeText(this, R.string.menu_option4, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Option5:
                Toast.makeText(this, R.string.menu_option5, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Option6:
                Toast.makeText(this, R.string.menu_option6, Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}