package com.retailsbs.example3.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.retailsbs.example3.R;
import com.retailsbs.example3.fragments.FragmentAddress;
import com.retailsbs.example3.fragments.FragmentPerson;

import org.json.JSONObject;

public class MainActivity extends RootActivity {

    private Fragment mFragmentPerson;
    private Fragment mFragmentAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentPerson = new FragmentPerson();
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fl_person, mFragmentPerson, null).addToBackStack(null).commit();


        mFragmentAddress = new FragmentAddress();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fl_listAddress,mFragmentAddress, null).addToBackStack(null).commit();

    }

    public JSONObject getDataPerson (){
        mFragmentPerson.getData
    }


}
