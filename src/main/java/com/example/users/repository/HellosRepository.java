package com.example.users.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.users.model.HelloMsg;

public interface HellosRepository extends MongoRepository<HelloMsg, String> {
}
