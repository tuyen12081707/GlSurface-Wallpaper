package com.example.testmlkit.utils;

import static com.example.testmlkit.Constants.URL_API;

import android.net.Uri;
import android.util.Log;

import com.example.testmlkit.data.CatalogItem;

public class UrlFactory {

    public static String getDownloadUrl(CatalogItem item) {
        Uri.Builder b = Uri.parse(URL_API).buildUpon();
        b.appendPath(item.getId() + ".zip");
        b.appendQueryParameter("raw", "true");
        Log.d("TAG===", b.toString());
        return b.toString();
    }

    public static String getThumbnailUrl(CatalogItem item) {
        Uri.Builder b = Uri.parse(URL_API).buildUpon();
        b.appendPath(item.getId() + ".png");
        b.appendQueryParameter("raw", "true");
        Log.d("hello==thumbNail", b.toString());
        return b.toString();
    }

    public static String getPreviewUrl(CatalogItem item) {
        Uri.Builder b = Uri.parse(URL_API).buildUpon();
        b.appendPath(item.getId() + ".mp4");
        b.appendQueryParameter("raw", "true");
        return b.toString();
    }

    public static String getCatalogUrl() {
        Uri.Builder b = Uri.parse(URL_API).buildUpon();
        b.appendPath("catalog.json");
        b.appendQueryParameter("raw", "true");
        Log.d("hello==", b.toString());
        return b.toString();
    }
}
