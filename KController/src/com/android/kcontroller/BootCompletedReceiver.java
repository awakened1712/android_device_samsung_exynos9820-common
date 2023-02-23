package com.android.kcontroller;

import com.android.kcontroller.utils.FileUtils;
import com.android.kcontroller.utils.Tags;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;

public class BootCompletedReceiver extends BroadcastReceiver {
    private static final boolean DEBUG = false;
    private static final String TAG = "KController";

    @Override
    public void onReceive(final Context context, Intent intent) {
        if (DEBUG)
            Log.d(TAG, "Received boot completed intent");

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);

        boolean kDevfreqBoost = sharedPrefs.getBoolean(Tags.DEVFREQ_BOOST_KEY, false);
        FileUtils.writeLine(Tags.DEVFREQ_BOOST_NODE, kDevfreqBoost?"1":"0");

        boolean kUnderclock = sharedPrefs.getBoolean(Tags.CPU_UNDERCLOCK_KEY, false);
        if (!kUnderclock) {
            FileUtils.writeLine(Tags.CPU_0_FREQ_NODE, "1950000");
            FileUtils.writeLine(Tags.CPU_4_FREQ_NODE, "2314000");
            FileUtils.writeLine(Tags.CPU_6_FREQ_NODE, "2730000");
        }
        else {
            FileUtils.writeLine(Tags.CPU_0_FREQ_NODE, "1300000");
            FileUtils.writeLine(Tags.CPU_4_FREQ_NODE, "1794000");
            FileUtils.writeLine(Tags.CPU_6_FREQ_NODE, "2236000");
        }

        boolean kChargingLimit = sharedPrefs.getBoolean(Tags.CHARGING_LIMIT_KEY, false);
        if (!kChargingLimit)
            FileUtils.writeLine(Tags.CHARGING_LIMIT_NODE, "0");
        else {
            int kChargingLimitThreshold = sharedPrefs.getInt(Tags.CHARGING_LIMIT_THRESHOLD_KEY, 85);
            FileUtils.writeLine(Tags.CHARGING_LIMIT_NODE, String.valueOf(kChargingLimitThreshold));
        }
    }
}
