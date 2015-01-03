package com.rakeshdas.rssparse;

import java.net.URL;

import nl.matshofman.saxrssreader.RssFeed;
import nl.matshofman.saxrssreader.RssReader;

public class Downloader {
    URL url = new URL("http://reddit.com/r/FlashTV/.rss");
    RssFeed feed = RssReader.read(url);
}
