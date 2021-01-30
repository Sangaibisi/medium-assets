package com.emrullah.medium.spring.datasource.routing.spring.configuration;

import com.emrullah.medium.spring.datasource.routing.spring.utilization.DatabaseContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouter extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getCurrentDb();
    }
}
