package com.emrullah.medium.spring.datasource.routing.service;

import com.emrullah.medium.spring.datasource.routing.spring.constant.DatabaseContext;
import com.emrullah.medium.spring.datasource.routing.spring.utilization.DatabaseContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DummyServiceImpl {

    @Transactional(readOnly = true)
    public Object getObject(Object p) {
        DatabaseContextHolder.setCurrentDb(DatabaseContext.REPLIKA);   //Set ThreadLocal DataSource lookup key, all connection from here will go to REPLIKA
        //Your business is over here...
        DatabaseContextHolder.clear();//Clear ThreadLocal

        return null;
    }
}
