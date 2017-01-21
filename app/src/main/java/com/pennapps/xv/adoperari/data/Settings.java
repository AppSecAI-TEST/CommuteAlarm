package com.pennapps.xv.adoperari.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/** Access SharedPreferences data
 * Created by sng on 1/21/2017.
 */

public class Settings extends PreferenceFragment{

    SharedPreferences sp;

    public static Settings getInstance(Context c){
        Settings set = new Settings();
        set.sp = PreferenceManager.getDefaultSharedPreferences(c);
        return set;
    }

    public void setIsSetup(boolean isSetup){
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("isSetup", isSetup);
        editor.apply();
    }

    public boolean isSetup(){
        return sp.getBoolean("isSetup", false);
    }

}
