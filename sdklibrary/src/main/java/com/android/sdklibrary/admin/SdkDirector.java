package com.android.sdklibrary.admin;

import android.content.Context;

/**
 * @author 小段果果
 * @time 2016/6/12  15:23
 * @E-mail duanyikang@mumayi.com
 */

public class SdkDirector {

    private static SdkDirector sdkDirector = null;
    private SdkBuilder sdkBuilder = null;

    private SdkDirector(SdkBuilder sdkBuilder) {
        this.sdkBuilder = sdkBuilder;
    }

    public static SdkDirector getInstance(SdkBuilder sdkBuilder) {
        if (sdkDirector == null) {
            sdkDirector = new SdkDirector(sdkBuilder);
        }
        return sdkDirector;
    }

    public SdkDirector setUserKey(String str)
    {
        sdkBuilder.setUserKey(str);
        return sdkDirector;
    }
    public SdkDirector setUserChannel(String str)
    {
        sdkBuilder.setUserChannel(str);
        return sdkDirector;
    }
    public SdkDirector setUserAppName(String str)
    {
        sdkBuilder.setUserAppName(str);
        return sdkDirector;
    }

    public void GotoActivity(Context context)
    {
        sdkBuilder.GoToActvity(context);
    }
}

