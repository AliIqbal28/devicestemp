package com.example.demo.request;

import com.example.demo.deviceInfo.DeviceInfo;

public class DeviceRegistration {
    DeviceInfo deviceInfo;
    String locationUUID;

    public DeviceRegistration(DeviceInfo deviceInfo, String locationUUID) {
        this.deviceInfo = deviceInfo;
        this.locationUUID = locationUUID;
    }

    public DeviceRegistration() {
        this.deviceInfo=new DeviceInfo();
        this.locationUUID="";
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getLocationUUID() {
        return locationUUID;
    }

    public void setLocationUUID(String locationUUID) {
        this.locationUUID = locationUUID;
    }
}
