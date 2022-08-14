package com.example.demo.deviceAssetAssignmentRecordArchive;

import org.apache.ignite.Ignite;
import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "DeviceAssetAssignmentRecordArchiveCache")
public interface DeviceAssetAssignmentRecordArchiveRepository extends IgniteRepository<DeviceAssetAssignmentRecordArchive,Long> {

}
