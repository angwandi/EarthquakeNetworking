package com.example.demad.earthquakenetworking;

public class Earthquake {
    /*Magnitude of the earthquake*/
    private String mMagnitude;
    /*Location of the earthquake*/
    private String mLocation;
    /*Date of the earthquake*/
    private String mDate;
    /*Time of the earthquake*/
    private Long mTimeInMilliseconds;

    /*Create a new Earthquake object*/

    public Earthquake(String magnitude, String location, Long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /*Returns the magnitude of the earthquake*/
    public String getMagnitude() {
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

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

