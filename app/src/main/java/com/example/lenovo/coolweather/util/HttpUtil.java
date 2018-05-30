package com.example.lenovo.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lenovo on 2018/5/30.
 */

public class HttpUtil {
    /**
     * 和服务器交互类
     * @param address 请求地址
     * @param callback 回调接口
     */

    public  static void sendOkHttpRequest(String  address , okhttp3.Callback callback)
    {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
