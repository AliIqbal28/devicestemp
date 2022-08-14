package com.example.demo.deviceInfo;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;
import java.util.Date;

public class DeviceInfo implements Serializable {

    @QuerySqlField
    Long id;
    @QuerySqlField
    String name;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    String tanentUUID;
    @QuerySqlField
    String model;
    @QuerySqlField
    String manufacturer;
    @QuerySqlField
    String type;
    @QuerySqlField
    Date lastActiveTime;
    @QuerySqlField
    Date registeredDate;
    @QuerySqlField
    String status;
    @QuerySqlField
    String UniqueHardwareId;

    public DeviceInfo() {
    }

    public DeviceInfo(Long id, String name, String uuid, String tanentUUID, String model, String manufacturer, String type, Date lastActiveTime, Date registeredDate, String status, String uniqueHardwareId) {
        this.id = id;
        this.name = name;
        this.uuid = uuid;
        this.tanentUUID = tanentUUID;
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = type;
        this.lastActiveTime = lastActiveTime;
        this.registeredDate = registeredDate;
        this.status = status;
        UniqueHardwareId = uniqueHardwareId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTanentUUID() {
        return tanentUUID;
    }

    public void setTannentUUID(String tanentUUID) {
        this.tanentUUID = tanentUUID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUniqueHardwareId() {
        return UniqueHardwareId;
    }

    public void setUniqueHardwareId(String uniqueHardwareId) {
        UniqueHardwareId = uniqueHardwareId;
    }
}
