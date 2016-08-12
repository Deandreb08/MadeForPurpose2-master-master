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
public class QuickInfoFragment extends Fragment {
    public QuickInfoFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.event_list,container,false);

        final ArrayList<Event> events = new ArrayList<>();
        events.add(new Event("8:30 a.m.- 5 p.m.","Visit the offices of Admissions,Financial Aid,Records and Student Accounts","Claibourne D. Smith Administration Building (Bldg. #40)","" +
                "Representatives will be available to answer any question you may have."));
        events.add(new Event("9 a.m. - 5 p.m.", "Payment of Fees,Office of Student Accounts", "Claibourne D. Smith Administration Building (Bldg. #40)","1st floor parlor"));
        events.add(new Event("9 a.m. - 4 p.m.", "ID Card Photo", "Claibourne D. Smith Administration Building (Bldg. #40)", "1st floor parlors" ));
        events.add(new Event("8:30 a.m. - 3 p.m.", "Additional Activities", null, "Should you find that you have some additional time between activities, feel free to take advantage of the " +
                "following options; Visit the Bookstore, Stop by the lobby outsied of the Office of Admission to turn in your evaluation and get your free T-shirt!"));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}
