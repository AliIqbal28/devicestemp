package com.example.demo;

import com.example.demo.coordinate.Coordinate;
import com.example.demo.deviceAssetAssignmentRecord.DeviceAssetAssignmentRecord;
import com.example.demo.deviceAssetAssignmentRecordArchive.DeviceAssetAssignmentRecordArchive;
import com.example.demo.deviceData.DeviceData;
import com.example.demo.deviceGeofenceAssignmentRecord.DeviceGeofenceAssignmentRecord;
import com.example.demo.deviceGeofenceAssignmentRecordArchive.DeviceGeofenceAssignmentRecordArchive;
import com.example.demo.deviceInfo.DeviceInfo;
import org.apache.ignite.configuration.IgniteConfiguration;
import com.example.demo.geofence.Geofence;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.springdata20.repository.config.EnableIgniteRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableIgniteRepositories
public class IgniteDataConfiguration {
    @Bean
    public Ignite igniteInstance() {
        IgniteConfiguration config = new IgniteConfiguration();

        CacheConfiguration deviceInfoCache = new CacheConfiguration("DevicesInfoCache");
        deviceInfoCache.setIndexedTypes(Long.class, DeviceInfo.class);

        CacheConfiguration geofenceCache = new CacheConfiguration("GeofenceCache");
        geofenceCache.setIndexedTypes(Long.class, Geofence.class);

        CacheConfiguration coordinateCache = new CacheConfiguration("CoordianteCache");
        coordinateCache.setIndexedTypes(Long.class, Coordinate.class);


        CacheConfiguration deviceDataCache = new CacheConfiguration("DeviceDataCache");
        deviceDataCache.setIndexedTypes(Long.class, DeviceData.class);

        CacheConfiguration deviceAssetAssignmentRecordCache = new CacheConfiguration("DeviceAssetAssignmentRecordCache");
        deviceAssetAssignmentRecordCache.setIndexedTypes(Long.class, DeviceAssetAssignmentRecord.class);

        CacheConfiguration deviceAssetAssignmentRecordArchiveCache = new CacheConfiguration("DeviceAssetAssignmentRecordArchiveCache");
        deviceAssetAssignmentRecordArchiveCache.setIndexedTypes(Long.class, DeviceAssetAssignmentRecordArchive.class);


        CacheConfiguration deviceGeofenceAssignmentRecordCache = new CacheConfiguration("DeviceGeofenceAssignmentRecordCache");
        deviceGeofenceAssignmentRecordCache.setIndexedTypes(Long.class, DeviceGeofenceAssignmentRecord.class);


        CacheConfiguration deviceGeofenceAssignmentRecordArchiveCache = new CacheConfiguration("DeviceGeofenceAssignmentRecordArchiveCache");
        deviceGeofenceAssignmentRecordArchiveCache.setIndexedTypes(Long.class, DeviceGeofenceAssignmentRecordArchive.class);



        config.setClientMode(true);
        config.setPeerClassLoadingEnabled(true);
        config.setCacheConfiguration(deviceInfoCache,geofenceCache,coordinateCache, deviceDataCache,deviceAssetAssignmentRecordCache,
                deviceAssetAssignmentRecordArchiveCache,deviceGeofenceAssignmentRecordCache, deviceGeofenceAssignmentRecordArchiveCache );

        Ignite ignite = Ignition.getOrStart(config);
        ignite.cluster().active(true);
        ignite.active();
        return ignite;
    }
}
