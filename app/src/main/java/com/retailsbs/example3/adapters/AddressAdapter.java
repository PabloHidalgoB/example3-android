package com.retailsbs.example3.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.retailsbs.example3.R;

import java.util.ArrayList;

/**
 * Created by Trabajo on 04-10-2017.
 */

public class AddressAdapter extends ArrayAdapter<String> {

    private Context mContext;
    private ArrayList<String> mArrayList;
    private TextView mRowAddress;

    public AddressAdapter(Context mContext, int resource, ArrayList<String> mArrayList) {
        super(mContext, resource, mArrayList);

        this.mContext = mContext;
        this.mArrayList = mArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View mView = convertView;

        if (mView == null){
            LayoutInflater vI = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = vI.inflate(R.layout.row_address, parent, false);
        }

        mRowAddress = (TextView) mView.findViewById(R.id.row_address);
        mRowAddress.setText(mArrayList.get(position));

        return mView;


    }
}
