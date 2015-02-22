package com.devchuk.root.parrot;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Library extends ActionBarActivity{
    String access_token = "cf602569-5311-0187-4f59-b13a64";
//    String username = "furnose1%40gmail.com";
    String consumer_key = "38330-24d0747dc89fa03cacfbad64";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        PostReq yo = new PostReq();
        yo.execute();
    }

    private class PostReq extends AsyncTask<URL, Void, String> {


        String respon = "";
        protected String doInBackground(URL... urls) {
            // Create a new HttpClient and Post Header
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost("https://getpocket.com/v3/get");

            try {
                // Add your data
                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
                nameValuePairs.add(new BasicNameValuePair("consumer_key", consumer_key));
                nameValuePairs.add(new BasicNameValuePair("access_token", access_token));
                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                // Execute HTTP Post Request
                HttpResponse response = httpclient.execute(httppost);
//                respon = response.getEntity();
                respon = EntityUtils.toString(response.getEntity());
                return respon;
            } catch (ClientProtocolException e) {
                // TODO Auto-generated catch block
            } catch (IOException e) {
                // TODO Auto-generated catch block
            }
            return "";
        }

        protected void onPostExecute(String request_token) {
            TextView t = (TextView) findViewById(R.id.token);
            t.setText(respon);
        }
    }

}