package com.emrullah.medium.spring.datasource.routing.spring.utilization;

import com.emrullah.medium.spring.datasource.routing.spring.constant.DatabaseContext;

/*
 * DataBaseContextHolder which is a utility class that
 * can set the data source context dynamically which has the following implementation.
 */
public abstract class DatabaseContextHolder {

    private static final ThreadLocal<DatabaseContext> dbContextHolder = new ThreadLocal<>();

    public static void setCurrentDb(DatabaseContext dbType) {
        if(dbType == null){
            throw new UnsupportedOperationException();
        }
        dbContextHolder.set(dbType);
    }

    public static DatabaseContext getCurrentDb() {
        return dbContextHolder.get();
    }

    public static void clear() {
        dbContextHolder.remove();
    }
}
