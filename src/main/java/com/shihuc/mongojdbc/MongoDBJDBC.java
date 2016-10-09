package com.shihuc.mongojdbc;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoDBJDBC {
    public static void main(String args[]) {
        try {
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // 连接到数据库
            DB db = mongoClient.getDB("mycol");
            db.createCollection("test", null);
            System.out.println(db.getName());
            System.out.println("Connect to database successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}