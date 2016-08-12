package com.example.dsuappacademy.newstudent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by dsuappacademy on 8/5/16.
 */
public class MyScheduleFragment extends Fragment {
    public MyScheduleFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_my_schedule,container,false);

        final ArrayList<Event> events = new ArrayList<>();
        events.add(new Event("5 p.m. - 6 p.m.", "Hornet to Hornet: The Real DSU", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors" ));
        events.add(new Event("6 p.m. - 7:30 p.m.", "Its a Family Affair!", "Martin Luther King Jr. Student Center (Bldg. #3)", "1st floor parlors"));
        events.add(new Event("8 p.m. - 11 p.m.", "Welcome to the New Era", "Wellness and Recreation Center (Bldg.#5)", "Come get a glimps of the DSU social experience"));
        events.add(new Event("Midnight", "Lights Out", null, null));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        EventAdapter adapter = new EventAdapter(getActivity(), events);
        listView.setAdapter(adapter);

        return rootView;



    }
}
