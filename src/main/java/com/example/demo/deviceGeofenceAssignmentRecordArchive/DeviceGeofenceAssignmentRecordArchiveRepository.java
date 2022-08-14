package com.example.demo.deviceGeofenceAssignmentRecordArchive;

import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "DeviceGeofenceAssignmentRecordArchiveCache")
public interface DeviceGeofenceAssignmentRecordArchiveRepository extends IgniteRepository<DeviceGeofenceAssignmentRecordArchive,Long> {
}
