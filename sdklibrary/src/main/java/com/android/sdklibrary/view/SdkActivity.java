package com.android.sdklibrary.view;

import android.app.Activity;
import android.os.Bundle;

import com.android.sdklibrary.R;


public class SdkActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sdk_activity_main);

    }
}
