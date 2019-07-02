//package com.zjpl.edw.utils;
//
//import org.apache.hadoop.hbase.client.HTable;
//
//import java.io.IOException;
//
///**
// * HBase操作工具类
// */
//public class HBaseUtils {
//
//    public  static synchronized HBaseUtils getInstance(){
//        if(null = instance){
//            instance = new HBaseUtils();
//        }
//        return instance;
//    }
//
//    /**
//     * 根据表名获取到HTable实例
//     */
//    public HTable getTable(String tableName){
//        HTable table =null;
//        try{
//            table = new HTable(conf,tableName);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        return table;
//    }
//}
