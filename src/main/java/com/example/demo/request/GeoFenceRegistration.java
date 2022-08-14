package com.example.demo.request;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

public class GeoFenceRegistration {
    String locationUUID;
    double longitude;
    double latitude;
    double altitude;

    public GeoFenceRegistration(String locationUUID, double longitude, double latitude, double altitude) {
        this.locationUUID = locationUUID;
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
    }

    public GeoFenceRegistration() {
    }

    public String getLocationUUID() {
        return locationUUID;
    }

    public void setLocationUUID(String locationUUID) {
        this.locationUUID = locationUUID;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
}
