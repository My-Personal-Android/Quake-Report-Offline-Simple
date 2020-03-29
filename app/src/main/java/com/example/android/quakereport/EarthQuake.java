package com.example.android.quakereport;

public class EarthQuake {

    private String Name;
    private String magnitude;
    private long timeinmillisecond;


    public EarthQuake(String magnitude, String name, long time) {
        this.magnitude = magnitude;
        this.Name = name;
        this.timeinmillisecond = time;
    }

    public String getName() {
        return Name;
    }


    public String getMagnitude() {
        return magnitude;
    }


    public long getTimeinmillisecond() {
        return timeinmillisecond;
    }


}
