package com.android.sdklibrary.admin;

import android.content.Context;
import android.content.Intent;

import com.android.sdklibrary.presenter.util.Constant;
import com.android.sdklibrary.view.SdkActivity;


/**
 * @author 小段果果
 * @time 2016/6/12  15:18
 * @E-mail duanyikang@mumayi.com
 */

public class SdkImplBuilder extends SdkBuilder {
    @Override
    public void setUserKey(String str) {
        sdkInstance.setUserKey(str);
        Constant.sdkInstance.setUserKey(str);
    }

    @Override
    public void setUserChannel(String str) {
        sdkInstance.setUserChannel(str);
        Constant.sdkInstance.setUserChannel(str);
    }

    @Override
    public void setUserAppName(String str) {
        sdkInstance.setUserAppName(str);
        Constant.sdkInstance.setUserAppName(str);
    }

    @Override
    public void GoToActvity(Context context) {
        if (Constant.sdkInstance.getUserAppName() == null)
            throw new IllegalArgumentException("UserAppName can not be null");
        if (Constant.sdkInstance.getUserChannel() == null)
            throw new IllegalArgumentException("UserChannel can not be null");
        if (Constant.sdkInstance.getUserKey()==null)
            throw new IllegalArgumentException("UserKey can not be null");
        Intent intent = new Intent(context, SdkActivity.class);
        context.startActivity(intent);
    }
}

