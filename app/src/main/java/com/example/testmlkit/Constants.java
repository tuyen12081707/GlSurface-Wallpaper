package com.example.testmlkit;

@SuppressWarnings("WeakerAccess")
public class Constants {

    // System
    public final static String URL_API = "https://github.com/lucasasselli/zero/blob/master/wallpapers/";
    public final static String PACKAGE_NAME = "com.example.testmlkit";
    public final static String SERVICE_NAME = PACKAGE_NAME + ".wallpaper.MyWallpaperService";

    // Parallax
    public final static double SENSITIVITY_MIN = 0.1;
    public final static double SENSITIVITY_MAX = 0.5;
    public final static double DEPTH_MIN = 0.001;
    public final static double DEPTH_MAX = 0.01;
    public final static double FALLBACK_MIN = 0.0;
    public final static double FALLBACK_MAX = 0.05;
    public final static double ZOOM_MIN = 0.6;
    public final static double ZOOM_MAX = 1.0;
    public final static double SCROLL_AMOUNT_MIN = 0.3;
    public final static double SCROLL_AMOUNT_MAX = 0.05;
    public final static double DIM_MAX = 200.0;

    // Sensor
    public final static double VERTICAL_FIX = 0.01;

    // Time
    public final static long T_CATALOG_EXPIRATION = 24 * 3600;
    public final static int T_SERVER_TIMEOUT = 15000;
    // File system
    public final static String FS_DIR_ZERO = "Zero";
    public final static String FS_DIR_CACHE = "cache";

    // Local data
    public final static String LD_CATALOG = "catalog";
    public final static String LD_TIMESTAMP = "timestamp";

    // Background
    public final static String BG_FORMAT = ".png";

    // Preferences
    // NOTE: These are internal preferences not available to the user in the settings
    public final static String PREF_BACKGROUND = "background";
    public final static String PREF_BACKGROUND_DEFAULT = "fallback";
    public final static String PREF_CHECKSENS = "checksens";
    public final static boolean PREF_CHECKSENS_DEFAULT = true;
    public final static String PREF_FIRSTPREV = "firstprev";
    public final static boolean PREF_FIRSTPREV_DEFAULT = true;
}
