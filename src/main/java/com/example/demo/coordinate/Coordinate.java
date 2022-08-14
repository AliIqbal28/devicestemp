package com.example.demo.coordinate;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

public class Coordinate {
    @QuerySqlField
    Long id;
    @QuerySqlField
    String uuid;
    @QuerySqlField
    double longitude;
    @QuerySqlField
    double latitude;
    @QuerySqlField
    double altitude;
}
