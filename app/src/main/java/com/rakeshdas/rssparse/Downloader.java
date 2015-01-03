package com.rakeshdas.rssparse;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import nl.matshofman.saxrssreader.RssFeed;
import nl.matshofman.saxrssreader.RssReader;

public class Downloader extends Activity{
    private ListView lv;
    //private String myList[] = {"1", "2", "3"};
    public void getRss(){
        try{
            URL redditURL = new URL("http://reddt.com/r/flashtv/.rss");
            RssFeed feed = RssReader.read(redditURL);
            setContentView(R.layout.menu1_layout);
            lv = (ListView)findViewById(R.id.rssListview);

            List<String> myList = new ArrayList<String>();
            myList.add("TEst");
            myList.add("Test");
            myList.add("HI");
            myList.add("D");

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                    this, R.layout.menu1_layout,
                    myList);
            lv.setAdapter(arrayAdapter);

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
