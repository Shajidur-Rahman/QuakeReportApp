package com.example.android.quakereport;

public class ArrayMain {

    private double point;
    private String place;
    private String time;

    public ArrayMain(double point, String place, String time) {
        this.point = point;
        this.place = place;
        this.time = time;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}