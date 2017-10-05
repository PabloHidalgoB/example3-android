package com.retailsbs.example3.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.retailsbs.example3.R;
import com.retailsbs.example3.activities.RootActivity;
import com.retailsbs.example3.adapters.AddressAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trabajo on 04-10-2017.
 */

public class FragmentAddress extends Fragment {

    private RootActivity mRoot;

    private LinearLayout mLayout;
    private ListView mList;
    private ArrayList<String> mListAddress;
    private AddressAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mRoot = (RootActivity) getActivity();

        mLayout = (LinearLayout) inflater.inflate(R.layout.fragment_address, container, false);

        mList = (ListView) mLayout.findViewById(R.id.lstv_people);

        mListAddress = new ArrayList<>();

        mListAddress.add("Trento norte 406");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("Metro Universidad de chile 90");

        load();

        return mLayout;
    }

    public void load(){

        Parcelable mParcelable = mList.onSaveInstanceState();
        mAdapter = new AddressAdapter(mRoot, R.layout.row_address, mListAddress);
        mList.setAdapter(mAdapter);
        mList.onRestoreInstanceState(mParcelable);

    }
}
