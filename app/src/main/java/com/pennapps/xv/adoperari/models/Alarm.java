package com.pennapps.xv.adoperari.models;

import android.media.Ringtone;

import com.google.android.gms.location.places.Place;

import java.util.ArrayList;

/**
 * Created by sng on 1/21/2017.
 */

public class Alarm {

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public WorkLocation getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(WorkLocation workLocation) {
        this.workLocation = workLocation;
    }

   /* public Ringtone getRingtone() {
        return ringtone;
    }

    public void setRingtone(Ringtone ringtone) {
        this.ringtone = ringtone;
    }*/


    public Alarm(Time time, WorkLocation workLocation,int  prepareTime/*, Ringtone ringtone*/) {
        this.time = time;
        this.workLocation = workLocation;
        this.prepareTime = prepareTime;

        for(int i = 0; i < 7; i++){
            leaveHouseTimes.add(new DayTracker());
            arrivalDifference.add(new DayTracker());
        }
    }

    Time time;
    WorkLocation workLocation;
    int prepareTime;

    public int getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(int prepareTime) {
        this.prepareTime = prepareTime;
    }



    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    boolean enabled = true;

    //In minutes
    ArrayList<DayTracker> leaveHouseTimes = new ArrayList<>();
    ArrayList<DayTracker> arrivalDifference = new ArrayList<>(); //in minutes, + if late, - if early
    int safetyFactor = 5; //in minutes

    public ArrayList<DayTracker> getLeaveHouseTimes() {
        return leaveHouseTimes;
    }

    public ArrayList<DayTracker> getArrivalDifferences() {
        return arrivalDifference;
    }
}
