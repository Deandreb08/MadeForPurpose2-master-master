package com.example.dsuappacademy.newstudent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dsuappacademy on 8/5/16.
 */
public class MapFragment extends Fragment {
    public MapFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_map,container,false);

        return rootView;
    }
}
