package com.example.demo.deviceData;

import com.example.demo.deviceInfo.DeviceInfo;
import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.Query;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

import java.util.List;

@RepositoryConfig(cacheName = "DeviceDataCache")
public interface DeviceDataRepository extends IgniteRepository<DeviceData,Long> {
    @Query("SELECT * FROM DeviceData")
    public List<DeviceData> getAll();

}
