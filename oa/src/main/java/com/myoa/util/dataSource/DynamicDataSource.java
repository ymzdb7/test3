 package com.myoa.util.dataSource;
 
 import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
 
 public class DynamicDataSource extends AbstractRoutingDataSource
 {
   protected Object determineCurrentLookupKey()
   {
     return ContextHolder.getConsumerType();
   }
 }

