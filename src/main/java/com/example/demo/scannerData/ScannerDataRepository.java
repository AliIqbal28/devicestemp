package com.example.demo.scannerData;

import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "ScannerDataCache")
public interface ScannerDataRepository extends IgniteRepository<ScannerData,Long> {
}
