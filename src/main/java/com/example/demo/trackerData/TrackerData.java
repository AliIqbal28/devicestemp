package com.example.demo.trackerData;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;
import java.util.Date;

public class TrackerData implements Serializable {
    @QuerySqlField
    Long id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    Long deviceId;
    @QuerySqlField
    String positionUUID;
    @QuerySqlField
    Date deviceTime;
    @QuerySqlField
    double speed;
    @QuerySqlField
    double distanceCovered;
    @QuerySqlField
    boolean motion;
    @QuerySqlField
    double accuracy;
    @QuerySqlField
    double longitudeDifference;
    @QuerySqlField
    double latitudeDifference;
    @QuerySqlField
    float angle;
    @QuerySqlField
    int signalLevel;
    @QuerySqlField
    double gprsStatus;
    @QuerySqlField
    boolean ignition;

    public TrackerData(Long id, String uuid, Long deviceId, String positionUUID, Date deviceTime, double speed, double distanceCovered, boolean motion, double accuracy, double longitudeDifference, double latitudeDifference, float angle, int signalLevel, double gprsStatus, boolean ignition) {
        this.id = id;
        this.uuid = uuid;
        this.deviceId = deviceId;
        this.positionUUID = positionUUID;
        this.deviceTime = deviceTime;
        this.speed = speed;
        this.distanceCovered = distanceCovered;
        this.motion = motion;
        this.accuracy = accuracy;
        this.longitudeDifference = longitudeDifference;
        this.latitudeDifference = latitudeDifference;
        this.angle = angle;
        this.signalLevel = signalLevel;
        this.gprsStatus = gprsStatus;
        this.ignition = ignition;
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

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getPositionUUID() {
        return positionUUID;
    }

    public void setPositionUUID(String positionUUID) {
        this.positionUUID = positionUUID;
    }

    public Date getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Date deviceTime) {
        this.deviceTime = deviceTime;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistanceCovered() {
        return distanceCovered;
    }

    public void setDistanceCovered(double distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    public boolean isMotion() {
        return motion;
    }

    public void setMotion(boolean motion) {
        this.motion = motion;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getLongitudeDifference() {
        return longitudeDifference;
    }

    public void setLongitudeDifference(double longitudeDifference) {
        this.longitudeDifference = longitudeDifference;
    }

    public double getLatitudeDifference() {
        return latitudeDifference;
    }

    public void setLatitudeDifference(double latitudeDifference) {
        this.latitudeDifference = latitudeDifference;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public int getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(int signalLevel) {
        this.signalLevel = signalLevel;
    }

    public double getGprsStatus() {
        return gprsStatus;
    }

    public void setGprsStatus(double gprsStatus) {
        this.gprsStatus = gprsStatus;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }
}
