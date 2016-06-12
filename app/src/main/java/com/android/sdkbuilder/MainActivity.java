package com.android.sdkbuilder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.sdklibrary.admin.SdkBuilder;
import com.android.sdklibrary.admin.SdkDirector;
import com.android.sdklibrary.admin.SdkImplBuilder;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sdk_activity_main);

        SdkBuilder sdkBuilder=new SdkImplBuilder();
        SdkDirector sdkDirector= SdkDirector.getInstance(sdkBuilder);
        sdkDirector.setUserAppName("123").setUserKey("123").setUserChannel("123").GotoActivity(this);

    }
}
