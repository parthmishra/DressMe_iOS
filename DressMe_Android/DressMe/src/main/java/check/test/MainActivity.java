/*! \mainpage DressMe_Android Manual
 *
 * Currently updated to include the major classes and function calls.
 *
 * \section intro_sec Introduction
 *
 * DressMe_Android is the android software designed to creating from selection of clothing to help
 * the user decide what to wear.
 *
 * \section install_sec Installation
 *
 * \subsection step1 Step 1: Download the DressMe_Android Folder
 *
 *No other files outside of this directory is needed
 *
 *\subsection step2 Step 2: Import it into Android Studio
 *
 *http://developer.android.com/sdk/index.html?gclid=Cj0KEQiAnJqzBRCW0rGWnKnckOIBEiQA6qDBansVdZzNTq_ydYsfe8TKvrCCPyrsxOrUovuBC88e9YQaAjKl8P8HAQ
 *
 *\subsection step3 Step 3: Build and Run
 *
 *An android hardware may be needed to run the project.
 * For integrated emulation software, http://developer.android.com/tools/devices/emulator.html#apps
 *
 * \section class_sec Relevant Classes
 * CreationScreen
 * Favorites
 * MainActivity
 * Main2Activity
 *
 *
 */

package check.test;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;
import android.widget.ImageButton;
import android.content.Intent;

///First Application Page



/**
 * Created when Application first starts. Lays out profile settings if user settings are set to null.
 *
 * Presss anywhere on screen leads to the second screen, the CreationScreen activity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton button_legging = (ImageButton) findViewById(R.id.FirstButton);
        button_legging.setOnClickListener(new View.OnClickListener() {
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

    /**
     * dfdsfdsafdsafdsafdsaf
     *
     * Detailed description of file.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
