package com.AnkushCodes.journalApp.TestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.MongoTemplate;

@RestController
public class TestController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/testMongo")
    public String testMongoConnection() {
        try {
            return mongoTemplate.getDb().getName();
        } catch (Exception e) {
            return "Failed to connect to MongoDB: " + e.getMessage();
        }
    }
}
