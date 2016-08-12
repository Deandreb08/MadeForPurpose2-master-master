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
public class ScheduleFragment extends Fragment {
    public ScheduleFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_schedule, container, false);


        final ArrayList<Event> events = new ArrayList<>();
        events.add(new Event("7:30 a.m.- 8:30 a.m.", "Registration and Ckeck-in for All New Students", "Wellness and Recreation Center (Bldg. #5)", "1st floor court"));
        events.add(new Event("7:30 a.m. - 8:30 a.m.", "Information Fair", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor lobby"));
        events.add(new Event("9 a.m. - 9:50 a.m.", "Welcome Session", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors"));
        events.add(new Event("10 a.m. - 10:50 a.m.", "Financial Aid and Student Accounts", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors"));
        events.add(new Event("3 p.m. - 4 p.m.", "Rules of Engagment", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors "));
        events.add(new Event("4 p.m. - 4:45 p.m.", "T9 Healthy Choices", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors" ));
        events.add(new Event("5 p.m. - 6 p.m.", "Hornet to Hornet: The Real DSU", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors" ));
        events.add(new Event("6 p.m. - 7:30 p.m.", "Its a Family Affair!", "Martin Luther King Jr. Student Center (Bldg. #3)", "1st floor parlors"));
        events.add(new Event("8 p.m. - 11 p.m.", "Welcome to the New Era", "Wellness and Recreation Center (Bldg.#5)", "Come get a glimps of the DSU social experience"));
        events.add(new Event("Midnight", "Lights Out", null, null));

        final ArrayList<Event> events2 = new ArrayList<>();
        events2.add(new Event("7:30 a.m.- 8:30 a.m.", "Registration and Ckeck-in for All New Students", "Wellness and Recreation Center (Bldg. #5)", "1st floor court"));
        events2.add(new Event("7:30 a.m. - 8:30 a.m.", "Information Fair", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor lobby"));
        events2.add(new Event("9 a.m. - 9:50 a.m.", "Welcome Session", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors"));
        events2.add(new Event("10 a.m. - 10:50 a.m.", "Financial Aid and Student Accounts", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors"));
        events2.add(new Event("3 p.m. - 4 p.m.", "Rules of Engagment", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors " ));
        events2.add(new Event("4 p.m. - 4:45 p.m.", "T9 Healthy Choices", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors" ));
        events2.add(new Event("5 p.m. - 6 p.m.", "Hornet to Hornet: The Real DSU", "Martin Luther King Jr. Student Center (Bldg. #3)", "2nd floor parlors" ));
        events2.add(new Event("6 p.m. - 7:30 p.m.", "Its a Family Affair!", "Martin Luther King Jr. Student Center (Bldg. #3)", "1st floor parlors"));
        events2.add(new Event("8 p.m. - 11 p.m.", "Welcome to the New Era", "Wellness and Recreation Center (Bldg.#5)", "Come get a glimps of the DSU social experience"));
        events2.add(new Event("Midnight", "Lights Out", null, null));




        ListView listView = (ListView) rootView.findViewById(R.id.list);
        EventAdapter adapter = new EventAdapter(getActivity(), events2);
        listView.setAdapter(adapter);




        return rootView;

    }
}