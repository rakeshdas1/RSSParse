package com.rakeshdas.rssparse;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class menu1_Fragment extends android.support.v4.app.Fragment{
    private String finalURL = "https://www.reddit.com/r/FlashTV/.rss";
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu1_layout, container, false);
        return rootview;


    }
}
