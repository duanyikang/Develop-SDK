package com.android.sdklibrary.admin;

import android.content.Context;

/**
 * @author 小段果果
 * @time 2016/6/12  15:15
 * @E-mail duanyikang@mumayi.com
 */

public abstract class SdkBuilder {

    protected SdkInstance sdkInstance=new SdkInstance();
    public abstract void setUserKey(String str);
    public abstract void setUserChannel(String str);
    public abstract void setUserAppName(String str);
    public abstract void GoToActvity(Context context);
}

