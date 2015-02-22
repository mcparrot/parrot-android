package com.devchuk.root.parrot;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new PostReq().execute();
    }

}
//    38330-580cd7a625d88c3a23f06502