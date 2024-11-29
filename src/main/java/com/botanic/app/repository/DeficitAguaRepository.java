package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.DeficitAgua;

public interface DeficitAguaRepository extends MongoRepository<DeficitAgua, String> {
}
