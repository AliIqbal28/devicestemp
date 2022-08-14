package com.example.demo.geofence;

import com.example.demo.coordinate.Coordinate;
import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Geofence implements Serializable {
    @QuerySqlField
    Long id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    String description;
    @QuerySqlField
    String areaName;
    @QuerySqlField
    String tanentUUID;
    @QuerySqlField
    String locationUUID;
    @QuerySqlField
    Set<Coordinate> coordinates;

    public Geofence() {
    }

    public Geofence(Long id, String uuid, String description, String areaName, String tanentUUID, String locationUUID, Set<Coordinate> coordinates) {
        this.id = id;
        this.uuid = uuid;
        this.description = description;
        this.areaName = areaName;
        this.tanentUUID = tanentUUID;
        this.locationUUID = locationUUID;
        this.coordinates = coordinates;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTanentUUID() {
        return tanentUUID;
    }

    public void setTanentUUID(String tanentUUID) {
        this.tanentUUID = tanentUUID;
    }

    public String getLocationUUID() {
        return locationUUID;
    }

    public void setLocationUUID(String locationUUID) {
        this.locationUUID = locationUUID;
    }

    public Set<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Set<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }
}
