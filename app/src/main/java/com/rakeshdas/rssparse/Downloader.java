package com.rakeshdas.rssparse;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Downloader {
    private static String myTag = "RedditRSS";

    static final int POST_PROGRESS = 1;

    public static void DownloadFromIrl (String URL, FileOutputStream fos){
        try{
            URL url = new URL(URL);
            long startTIme = System.currentTimeMillis();
            Log.d(myTag, "download starting");

            URLConnection ucon = url.openConnection();


            Log.i(myTag, "opened connection");

            InputStream is = ucon.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            Log.i(myTag, "Got inputstream and BufferedInputStream");

        }
    }
}
