package com.android.kcontroller.utils;

public class Tags {
    public static final String CHARGING_LIMIT_KEY = "charging_limit";
    public static final String CHARGING_LIMIT_THRESHOLD_KEY = "charging_limit_threshold";
    public static final String CHARGING_LIMIT_NODE = "/sys/devices/platform/battery/power_supply/battery/batt_full_capacity";

    public static final String DEVFREQ_BOOST_KEY = "devfreq_boost";
    public static final String DEVFREQ_BOOST_NODE = "/sys/module/devfreq_boost/parameters/devfreq_boost";
}
