package com.example.demo.deviceGeofenceAssignmentRecord;

import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;


@RepositoryConfig(cacheName = "DeviceGeofenceAssignmentRecordCache")
public interface DeviceGeofenceAssignmentRecordRepository extends IgniteRepository<DeviceGeofenceAssignmentRecord,Long> {

}
