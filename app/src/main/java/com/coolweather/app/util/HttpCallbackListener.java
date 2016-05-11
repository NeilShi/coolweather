package com.coolweather.app.util;

/**
 * Created by Neil on 2016/5/11.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
