package com.devchuk.root.parrot;

import android.os.AsyncTask;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


/*
public void postData() {
        // Create a new HttpClient and Post Header
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("https://getpocket.com/v3/oauth/request");

        try {
            // Add your data
            List<NameValuePair> nameValuePairs = new ArrayList<>(2); //NameValuePair
            nameValuePairs.add(new BasicNameValuePair("redirect_uri", "pocketapp38321"));
            nameValuePairs.add(new BasicNameValuePair("consumer_key", "38321-1e0e764b512ec6ad8e5d3e78"));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            // Execute HTTP Post Request
            HttpResponse response = httpclient.execute(httppost);
            String request_token = response.toString();

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
    }
 */