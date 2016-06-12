package com.android.sdklibrary.admin;

/**
 * @author 小段果果
 * @time 2016/6/12  15:09
 * @E-mail duanyikang@mumayi.com
 */

public class SdkInstance {
    public String UserKey;
    public String UserChannel;
    public String UserAppName;



    public String getUserKey() {
        return UserKey;
    }

    public void setUserKey(String userKey) {
        UserKey = userKey;
    }

    public String getUserChannel() {
        return UserChannel;
    }

    public void setUserChannel(String userChannel) {
        UserChannel = userChannel;
    }

    public String getUserAppName() {
        return UserAppName;
    }

    public void setUserAppName(String userAppName) {
        UserAppName = userAppName;
    }
}

