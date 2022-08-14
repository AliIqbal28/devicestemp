package com.example.demo.position;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;

public class Position implements Serializable {
    @QuerySqlField
    Long id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    double longitude;
    @QuerySqlField
    double latitude;
    @QuerySqlField
    double altitude;
    @QuerySqlField
    double gpsOfInspection;
    @QuerySqlField
    double gps;

    public Position(Long id, String uuid, double longitude, double latitude, double altitude, double gpsOfInspection, double gps) {
        this.id = id;
        this.uuid = uuid;
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.gpsOfInspection = gpsOfInspection;
        this.gps = gps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public double getGpsOfInspection() {
        return gpsOfInspection;
    }

    public void setGpsOfInspection(double gpsOfInspection) {
        this.gpsOfInspection = gpsOfInspection;
    }

    public double getGps() {
        return gps;
    }

    public void setGps(double gps) {
        this.gps = gps;
    }
}
