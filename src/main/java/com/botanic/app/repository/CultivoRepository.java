package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Cultivo;

public interface CultivoRepository extends MongoRepository<Cultivo, String> {
}
