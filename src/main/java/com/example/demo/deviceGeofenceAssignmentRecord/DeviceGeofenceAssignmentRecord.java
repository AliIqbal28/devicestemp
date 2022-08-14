package com.example.demo.deviceGeofenceAssignmentRecord;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;
import java.util.Date;

public class DeviceGeofenceAssignmentRecord implements Serializable {

    @QuerySqlField
    String id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    String geofenceUUID;
    @QuerySqlField
    String deviceUUID;
    @QuerySqlField
    Date assignedDateTime;

    public DeviceGeofenceAssignmentRecord() {
    }

    public DeviceGeofenceAssignmentRecord(String id, String uuid, String geofenceUUID, String deviceUUID, Date assignedDateTime) {
        this.id = id;
        this.uuid = uuid;
        this.geofenceUUID = geofenceUUID;
        this.deviceUUID = deviceUUID;
        this.assignedDateTime = assignedDateTime;
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

    public String getGeofenceUUID() {
        return geofenceUUID;
    }

    public void setGeofenceUUID(String geofenceUUID) {
        this.geofenceUUID = geofenceUUID;
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
}
