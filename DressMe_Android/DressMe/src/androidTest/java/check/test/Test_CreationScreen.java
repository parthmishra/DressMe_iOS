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
public class Test_CreationScreen extends ActivityInstrumentationTestCase2<CreationScreen> {

    CreationScreen activity;
    public ImageButton Clothing_Top;
    public ImageButton Clothing_Legging;
    public ImageButton Clothing_Accessory;
    public ImageButton Clothing_Shoe;
    public ImageButton Button_Favorite;
    public ImageButton Button_Weather;
    public ImageButton Button_Add;
    public ImageButton Button_Upload;


    public Test_CreationScreen() {
        super(CreationScreen.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        setActivityInitialTouchMode(true);

    }

    @SmallTest
    public void testTopClothing() {
        Clothing_Top =(ImageButton) activity.findViewById(R.id.button_top);
        assertNotNull(Clothing_Top);
    }
    @SmallTest
    public void testLeggingClothing() {
        Clothing_Legging =(ImageButton) activity.findViewById(R.id.button_legging);
        assertNotNull(Clothing_Legging);
    }
    @SmallTest
    public void testAccessoryClothing() {
        Clothing_Accessory =(ImageButton) activity.findViewById(R.id.button_accessory);
        assertNotNull(Clothing_Accessory);
    }
    @SmallTest
    public void testShoeClothing() {
        Clothing_Shoe =(ImageButton) activity.findViewById(R.id.button_shoe);
        assertNotNull(Clothing_Shoe);
    }

    @SmallTest
    public void testButton_Favorite() {
        Button_Favorite =(ImageButton) activity.findViewById(R.id.favorite);
        assertNotNull(Button_Favorite);
    }

    @SmallTest
    public void testButton_Add() {
        Button_Add =(ImageButton) activity.findViewById(R.id.add);
        assertNotNull(Button_Add);
    }

    @SmallTest
    public void testButton_Weather() {
        Button_Weather =(ImageButton) activity.findViewById(R.id.weather);
        assertNotNull(Button_Weather);
    }

    @SmallTest
    public void testButton_Upload() {
        Button_Upload =(ImageButton) activity.findViewById(R.id.upload);
        assertNotNull(Button_Upload);
    }





}