package com.android.kcontroller.utils;

public class Tags {
    public static final String CHARGING_LIMIT_KEY = "charging_limit";
    public static final String CHARGING_LIMIT_THRESHOLD_KEY = "charging_limit_threshold";
    public static final String CHARGING_LIMIT_NODE = "/sys/devices/platform/battery/power_supply/battery/batt_full_capacity";

    public static final String DEVFREQ_BOOST_KEY = "devfreq_boost";
    public static final String DEVFREQ_BOOST_NODE = "/sys/module/devfreq_boost/parameters/devfreq_boost";

    public static final String CPU_UNDERCLOCK_KEY = "cpu_underclock";
    public static final String CPU_0_FREQ_NODE = "/sys/devices/system/cpu/cpufreq/policy0/scaling_max_freq";
    public static final String CPU_4_FREQ_NODE = "/sys/devices/system/cpu/cpufreq/policy4/scaling_max_freq";
    public static final String CPU_6_FREQ_NODE = "/sys/devices/system/cpu/cpufreq/policy6/scaling_max_freq";
}
