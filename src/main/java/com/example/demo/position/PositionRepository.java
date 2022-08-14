package com.example.demo.position;

import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "PositionCache")
public interface PositionRepository extends IgniteRepository<Position, Long> {

}
