package com.example.demad.earthquakenetworking;

public class Earthquake {
    /*Magnitude of the earthquake*/
    private double mMagnitude;
    /*Location of the earthquake*/
    private String mLocation;
    /*Date of the earthquake*/
    private String mDate;
    /*Time of the earthquake*/
    private long mTimeInMilliseconds;

    /*Create a new Earthquake object*/

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /*Returns the magnitude of the earthquake*/
    public double getMagnitude() {
        return mMagnitude;
    }

    /*Returns the location of the earthquake*/
    public String getLocation() {
        return mLocation;
    }

    /*Returns the date of the earthquake*/
    public String getDate() {
        return mDate;
    }

    /*Returns the time of the earthquake*/

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

