package com.example.demo.coordinate;

import com.example.demo.deviceData.DeviceData;
import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "CoordinateCache")
public interface CoordinateRepository extends IgniteRepository<Coordinate,Long> {
}
