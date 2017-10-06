package com.retailsbs.example3.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.retailsbs.example3.R;
import com.retailsbs.example3.fragments.FragmentAddress;
import com.retailsbs.example3.fragments.FragmentPerson;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends RootActivity {

    private FragmentPerson mFragmentPerson;
    private FragmentAddress mFragmentAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "==> Main!!");

        mFragmentPerson = new FragmentPerson();
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fl_person, mFragmentPerson, null).addToBackStack(null).commit();


        mFragmentAddress = new FragmentAddress();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fl_listAddress,mFragmentAddress, null).addToBackStack(null).commit();

    }

    public JSONObject getDataPerson(){

        mFragmentPerson.getDataPerson();
        //se obtienen loa datos de la persona que estan guardados dentro de mFragmentPerson a travez de un JSONObject.tostring
        JSONObject mJSONObject = new JSONObject();
        try{
            mJSONObject =  new JSONObject(mFragmentPerson.getDataPerson());
        }catch(JSONException e){
            e.printStackTrace();
        }
        return mJSONObject;
    }

}
