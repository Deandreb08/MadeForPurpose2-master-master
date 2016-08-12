package com.example.dsuappacademy.newstudent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dsuappacademy on 8/8/16.
 */
public class EventAdapter extends  ArrayAdapter<Event> {

    public EventAdapter(Context context, ArrayList<Event> events){
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View eventItem = convertView;
        if (eventItem == null){
            eventItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.event_layout,parent,false);
        }

        Event currentEvent = getItem(position);

        TextView eventTitle = (TextView) eventItem.findViewById(R.id.title);
        eventTitle.setText(currentEvent.getTitle());

        TextView eventTime = (TextView) eventItem.findViewById(R.id.time);
        eventTime.setText(currentEvent.getTime());

        TextView eventLocation = (TextView) eventItem.findViewById(R.id.location);
        eventLocation.setText(currentEvent.getLocation());

        TextView eventDescription = (TextView) eventItem.findViewById(R.id.description);
        eventDescription.setText(currentEvent.getDescription());

        return eventItem;
    }
}
