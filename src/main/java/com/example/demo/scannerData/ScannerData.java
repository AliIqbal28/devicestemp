package com.example.demo.scannerData;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;
import java.util.Date;

public class ScannerData implements Serializable {

    @QuerySqlField
    Long id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    Long deviceId;
    @QuerySqlField
    Date deviceTime;
    @QuerySqlField
    String scannedCode;
    @QuerySqlField
    String description;
    @QuerySqlField
    String positionUUID;

    public ScannerData(Long id, String uuid, Long deviceId, Date deviceTime, String scannedCode, String description, String positionUUID) {
        this.id = id;
        this.uuid = uuid;
        this.deviceId = deviceId;
        this.deviceTime = deviceTime;
        this.scannedCode = scannedCode;
        this.description = description;
        this.positionUUID = positionUUID;
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

    public Date getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Date deviceTime) {
        this.deviceTime = deviceTime;
    }

    public String getScannedCode() {
        return scannedCode;
    }

    public void setScannedCode(String scannedCode) {
        this.scannedCode = scannedCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPositionUUID() {
        return positionUUID;
    }

    public void setPositionUUID(String positionUUID) {
        this.positionUUID = positionUUID;
    }
}
