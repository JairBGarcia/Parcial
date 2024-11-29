package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Evaporacion;

public interface EvaporacionRepository extends MongoRepository<Evaporacion, String> {
}
