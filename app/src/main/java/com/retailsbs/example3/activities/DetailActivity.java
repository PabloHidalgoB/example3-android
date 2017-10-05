package com.retailsbs.example3.activities;

import android.nfc.Tag;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.retailsbs.example3.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Trabajo on 04-10-2017.
 */

public class DetailActivity extends RootActivity {

    private String mPerson;
    private String mAddress;


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_detail);
        setTitle("algo");

        if (getIntent().getExtras() != null){
            mPerson = getIntent().getExtras().getString("person");
            mAddress = getIntent().getExtras().getString("address");
        }

        try {
            JSONObject jsonResult = new JSONObject(mPerson);
            jsonResult.getJSONObject("data").getString("name");
            Log.d("TEST", "==> " + jsonResult.getJSONObject("data").getString("name"));

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
