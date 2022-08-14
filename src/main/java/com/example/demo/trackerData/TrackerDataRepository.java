package com.example.demo.trackerData;

import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "TrackerDataCache")
public interface TrackerDataRepository extends IgniteRepository<TrackerData,Long> {
}
