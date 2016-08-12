package com.example.dsuappacademy.newstudent;

/**
 * Created by dsuappacademy on 8/8/16.
 */
public class Event {
    private String time;
    private String title;
    private String location;
    private String description;

    public Event(String time, String title, String location, String description){
        this.time = time;
        this.title = title;
        this.location = location;
        this.description = description;
    }

    public String getTime(){return time;}

    public String getTitle(){return title;}

    public String getDescription(){return description;}

    public String getLocation(){return location;}
}

