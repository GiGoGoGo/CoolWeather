package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/6/1.
 */

public class Now {

    @SerializedName("tmp")
    public String temperatur;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
