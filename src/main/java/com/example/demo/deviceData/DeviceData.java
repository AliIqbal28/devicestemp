package com.example.demo.deviceData;

import com.example.demo.coordinate.Coordinate;
import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;


public class DeviceData implements Serializable{

    @QuerySqlField
    String id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    String deviceUUID;
    @QuerySqlField
    String time;
    @QuerySqlField
    Coordinate coordinates;
    @QuerySqlField
    String capturedRawData;
    //Set<DataField> capturedData;


    public DeviceData(String id, String uuid, String deviceUUID, String time, Coordinate coordinates, String capturedRawData) {
        this.id = id;
        this.uuid = uuid;
        this.deviceUUID = deviceUUID;
        this.time = time;
        this.coordinates = coordinates;
        this.capturedRawData = capturedRawData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDeviceUUID() {
        return deviceUUID;
    }

    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public String getCapturedRawData() {
        return capturedRawData;
    }

    public void setCapturedRawData(String capturedRawData) {
        this.capturedRawData = capturedRawData;
    }
}
