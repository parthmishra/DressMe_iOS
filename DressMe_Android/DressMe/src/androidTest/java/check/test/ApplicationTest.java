package check.test;

import android.app.Application;
import android.media.Image;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;
import android.widget.ImageButton;
import android.content.Intent;


///Testing Fundamentals
/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;
    CreationScreen activity2;
    public ImageButton Button_First;
    public ImageButton Button_Favorite;
    public ImageButton Button_Weather;
    public ImageButton Button_Add;
    public ImageButton Button_Upload;
    private TextView fail;


    public ApplicationTest() {
        super(MainActivity.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        setActivityInitialTouchMode(true);

    }

    @SmallTest
    public void testFirstButton() {
        Button_First =(ImageButton) activity.findViewById(R.id.FirstButton);
        assertNotNull(Button_First);
    }


}
