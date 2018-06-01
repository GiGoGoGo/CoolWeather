package com.example.lenovo.coolweather.gson;

/**
 * Created by lenovo on 2018/6/1.
 */

public class AQI {

    public AQICity city;

    public class AQICity
    {
        public String api;
        public String pm25;
    }
}
