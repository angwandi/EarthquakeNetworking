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
    //Website URL of the earthquake
    private String mUrl;

    /*Create a new Earthquake object*/

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
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

    public String getUrl() {
        return mUrl;
    }
}

