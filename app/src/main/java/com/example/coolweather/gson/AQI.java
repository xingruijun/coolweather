package com.example.coolweather.gson;

/**
 * Created by dell on 2018/6/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
