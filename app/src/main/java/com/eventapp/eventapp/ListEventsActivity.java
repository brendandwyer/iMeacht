package com.eventapp.eventapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by devin on 22/11/16.
 */

public class ListEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.listings_menu, menu);
        return true;
    }


}