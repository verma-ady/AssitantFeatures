package com.assitantfeatures.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.assitantfeatures.R;

public class Calls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);
        /*
        Detect Call
        1. PhoneCallReceiver
        2. Call Receiver
        3. Manifest

        Reject Call
        1. create directory aidl in src/main
        2. create package com.android.internal.telephony
        3. create a new aidl file ITelephony
         */
    }

    private void check(){
        //this is to check if vcs is working or not
    }
}
