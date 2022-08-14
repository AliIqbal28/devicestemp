package com.example.demo.deviceAssetAssignmentRecordArchive;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;
import java.util.Date;

public class DeviceAssetAssignmentRecordArchive implements Serializable {
    @QuerySqlField
    String id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    String assetUUID;
    @QuerySqlField
    String deviceUUID;
    @QuerySqlField
    Date assignedDateTime;
    @QuerySqlField
    Date unassignedDateTime;

    public DeviceAssetAssignmentRecordArchive(String id, String uuid, String assetUUID, String deviceUUID, Date assignedDateTime, Date unassignedDateTime) {
        this.id = id;
        this.uuid = uuid;
        this.assetUUID = assetUUID;
        this.deviceUUID = deviceUUID;
        this.assignedDateTime = assignedDateTime;
        this.unassignedDateTime = unassignedDateTime;
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

    public String getAssetUUID() {
        return assetUUID;
    }

    public void setAssetUUID(String assetUUID) {
        this.assetUUID = assetUUID;
    }

    public String getDeviceUUID() {
        return deviceUUID;
    }

    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }

    public Date getAssignedDateTime() {
        return assignedDateTime;
    }

    public void setAssignedDateTime(Date assignedDateTime) {
        this.assignedDateTime = assignedDateTime;
    }

    public Date getUnassignedDateTime() {
        return unassignedDateTime;
    }

    public void setUnassignedDateTime(Date unassignedDateTime) {
        this.unassignedDateTime = unassignedDateTime;
    }
}
