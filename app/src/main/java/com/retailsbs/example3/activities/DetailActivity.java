package com.retailsbs.example3.activities;

import android.nfc.Tag;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.retailsbs.example3.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Trabajo on 04-10-2017.
 */

public class DetailActivity extends RootActivity {

    private String mPerson;
    private String mAddress;


    private TextView mTxtName;
    private TextView mTxtRut;
    private TextView mTxtAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d("TAG", "==> entro!");


        mTxtName = (TextView) findViewById(R.id.txt_name);
        mTxtRut = (TextView) findViewById(R.id.txt_rut);
        mTxtAddress = (TextView) findViewById(R.id.txt_address);


        if (getIntent().getExtras() != null){
            mPerson = getIntent().getExtras().getString("person");
            mAddress = getIntent().getExtras().getString("address");
        }

        try {
            JSONObject jsonResult = new JSONObject(mPerson);
            mTxtName.setText(jsonResult.getJSONObject("data").getString("name"));

            jsonResult = new JSONObject(mPerson);
            mTxtRut.setText(jsonResult.getJSONObject("data").getString("rut"));

            mTxtAddress.setText(mAddress);

            Log.d("TEST", "==> " + jsonResult.getJSONObject("data").getString("name"));

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
