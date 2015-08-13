package com.vipercn.viper4android_v2.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

import com.vipercn.viper4android_v2.R;


public class Settings extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_settings);

		Intent go_selinux = new Intent("call.pdl.vipercore");

		Preference selinux = findPreference("go_selinux");
		selinux.setIntent(go_selinux);


	}


}