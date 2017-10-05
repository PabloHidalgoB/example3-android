package com.retailsbs.example3.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.retailsbs.example3.R;

/**
 * Created by Trabajo on 04-10-2017.
 */

public class DetailActivity extends RootActivity {

    private Fragment mFragmentPerson;
    private Fragment mFragmentAddress;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_detail);



    }
}
