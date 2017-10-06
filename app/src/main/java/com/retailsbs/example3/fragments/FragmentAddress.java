package com.retailsbs.example3.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.retailsbs.example3.R;
import com.retailsbs.example3.activities.DetailActivity;
import com.retailsbs.example3.activities.MainActivity;
import com.retailsbs.example3.activities.RootActivity;
import com.retailsbs.example3.adapters.AddressAdapter;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

import static android.content.ContentValues.TAG;

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
        // Obtiene la actividad de RootActivity para ser utilizada como contexto

        mLayout = (LinearLayout) inflater.inflate(R.layout.fragment_address, container, false);
        // Relaciona la clase FragmentAddress con el xml fragment_address dentro de la carpeta layout

        mList = (ListView) mLayout.findViewById(R.id.lstv_people);
        // Relaciona mList con el listview lstv_people contenido dentro de mLayout

        mListAddress = new ArrayList<>();

        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Trento norte 406");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("Avenida siempre viva 1475");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("i still know what you did last summer");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Metro Universidad de chile 90");
        mListAddress.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam feugiat placerat mi, ut aliquet mi maximus id. Phasellus porta euismod iaculis. Nunc venenatis sit amet mi quis dictum. Mauris dolor leo, consectetur vitae blandit sit amet, varius sit amet ante. Etiam pharetra justo quis neque ultricies finibus. Nulla sit amet justo et ex semper condimentum. Suspendisse lacinia neque enim, sed laoreet nulla volutpat in. Nulla dolor ipsum, porta quis imperdiet vel, consectetur eu magna. Praesent semper tortor dolor, vel ultrices tellus varius vel. Etiam imperdiet malesuada ligula eget tempus.\n" +
                "\n" +
                "Donec ac dignissim erat. Mauris tincidunt ligula urna, ac eleifend lorem congue vel. Phasellus sit amet consequat leo, nec mattis justo. Maecenas ornare mi pulvinar placerat posuere. Maecenas id venenatis diam, ac ultrices mi. Maecenas id mauris turpis. Nam fermentum ullamcorper enim ut congue. Cras sagittis suscipit tellus quis mattis.\n" +
                "\n" +
                "Nulla non pretium sapien, nec lacinia magna. Morbi tincidunt vitae odio in lobortis. Cras vitae neque sed neque pharetra sagittis eget imperdiet odio. Phasellus aliquam euismod nisl. Suspendisse a blandit tortor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse euismod augue sit amet diam tincidunt iaculis.\n" +
                "\n" +
                "Donec blandit fermentum sodales. Cras ac cursus orci. Integer consectetur elementum eros, id pellentesque massa pellentesque in. Nam at orci vel mi egestas ultricies vulputate in nunc. Fusce tincidunt massa sed tortor luctus consectetur. Morbi lacinia, lectus sit amet cursus accumsan, nibh arcu vestibulum turpis, congue fringilla odio turpis malesuada ligula. Aliquam et odio nec ipsum ornare egestas. Sed facilisis metus metus, sed finibus neque molestie in.\n" +
                "\n" +
                "Nunc odio nisi, malesuada eu euismod in, dignissim id diam. Duis quis lorem et orci dapibus consequat vel nec dui. Fusce feugiat, lectus et efficitur venenatis, tellus turpis fermentum turpis, eget malesuada risus orci eu sapien. Vestibulum vel bibendum enim, vel volutpat nibh. Morbi vestibulum sit amet elit nec dictum. In pulvinar ante odio, id varius massa sollicitudin vitae. Sed convallis porta feugiat. Aliquam id elementum neque, sed gravida massa. Integer nisl elit, rhoncus id vestibulum sit amet, varius a arcu. Fusce eget diam ut enim eleifend imperdiet. Nunc nisi risus, iaculis nec iaculis ac, mattis sit amet lacus. Cras non est molestie, sodales mi eleifend, feugiat leo. Duis vitae dictum ex, in ultrices ante. Suspendisse potenti.");

        load();

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //abre el contenido del listView mList en la posicion seleccionada

                JSONObject mJsonObject = new JSONObject();
                String mAddress = mListAddress.get(position);
                try{
                    mJsonObject = ((MainActivity) mRoot).getDataPerson();

                    Intent intent = new Intent(mRoot, DetailActivity.class);
                    intent.putExtra("person", mJsonObject.toString());
                    intent.putExtra("address", mAddress);
                    startActivity(intent);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        return mLayout;
    }

    public void load(){

        Parcelable mParcelable = mList.onSaveInstanceState();
        mAdapter = new AddressAdapter(mRoot, R.layout.row_address, mListAddress);
        mList.setAdapter(mAdapter);
        mList.onRestoreInstanceState(mParcelable);

    }
}
