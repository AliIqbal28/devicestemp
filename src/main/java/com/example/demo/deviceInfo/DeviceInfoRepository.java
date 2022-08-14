package com.example.demo.deviceInfo;

import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.Query;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

import java.util.List;

@RepositoryConfig(cacheName = "DevicesInfoCache")
public interface DeviceInfoRepository extends IgniteRepository<DeviceInfo, Long> {

    @Query("SELECT * FROM DeviceInfo")
    public List<DeviceInfo> getAll();

    public int countDeviceInfoById();

    public DeviceInfo getByUuid(String uuid);

    public DeviceInfo getByUniqueHardwareId(String UniqueHardwareId);
    }
