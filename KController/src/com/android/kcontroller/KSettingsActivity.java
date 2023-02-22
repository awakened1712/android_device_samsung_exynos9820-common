package com.android.kcontroller;

import android.os.Bundle;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;
import com.android.settingslib.widget.R;

public class KSettingsActivity extends CollapsingToolbarBaseActivity {

    private static final String TAG_KCONTROLLER = "kcontroller";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(R.id.content_frame,
                new KSettingsFragment(), TAG_KCONTROLLER).commit();
    }
}
