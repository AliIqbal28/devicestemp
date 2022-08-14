package com.example.demo.geofence;

import com.example.demo.deviceInfo.DeviceInfo;
import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.Query;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

import java.util.List;

@RepositoryConfig(cacheName = "GeofenceCache")
public interface GeofenceRepository extends IgniteRepository<Geofence, Long> {
    @Query("SELECT * FROM Geofence")
    public List<Geofence> getAll();

    public Geofence findByLocationUUID(String locationUUID);

}
