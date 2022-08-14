package com.example.demo.deviceAssetAssignmentRecord;


import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "DeviceAssetAssignmentRecordCache")
public interface DeviceAssetAssignmentRecordRepository extends IgniteRepository<DeviceAssetAssignmentRecord, Long> {

}
