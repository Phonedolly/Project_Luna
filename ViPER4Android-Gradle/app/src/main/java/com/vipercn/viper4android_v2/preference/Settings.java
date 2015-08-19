package com.vipercn.viper4android_v2.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import com.vipercn.viper4android_v2.R;
import com.vipercn.viper4android_v2.activity.change_log;


public class Settings extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_settings);

		Intent intent_go_selinux = new Intent("call.pdl.vipercore");
		Intent intent_go_egg = new Intent(this, egg.class);
		Intent intent_go_changeLog = new Intent(this, change_log.class);


		Preference selinux = findPreference("go_selinux");
		selinux.setIntent(intent_go_selinux);

		Preference go_egg = findPreference("go_egg");
		go_egg.setIntent(intent_go_egg);

		Preference change_log = findPreference("change_log");
		change_log.setIntent(intent_go_changeLog);










	}


}




