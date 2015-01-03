package com.rakeshdas.rssparse;

import android.app.Activity;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import nl.matshofman.saxrssreader.RssFeed;
import nl.matshofman.saxrssreader.RssReader;

public class Downloader extends Activity{
    public void getRss(){
        try{
            URL redditURL = new URL("http://reddt.com/r/flashtv/.rss");
            RssFeed feed = RssReader.read(redditURL);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch (SAXException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
