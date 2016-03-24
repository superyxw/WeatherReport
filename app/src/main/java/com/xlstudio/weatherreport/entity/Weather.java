package com.xlstudio.weatherreport.entity;

/**
 * Created by superyxw on 16/3/22.
 */
public class Weather {

    private String city;

    private String weather;

    private String temperature;

    public Weather(String city,String temperature){
        this.city = city;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
