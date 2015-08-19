package com.vipercn.viper4android_v2.preference;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.vipercn.viper4android_v2.R;

/**
 * Created by PDL on 2015-08-18.
 */
public class egg extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.easter_egg);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
