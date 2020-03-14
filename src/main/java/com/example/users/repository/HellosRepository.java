package com.example.users.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.users.model.HelloMsg;

public interface HellosRepository extends MongoRepository<HelloMsg, String> {
}
