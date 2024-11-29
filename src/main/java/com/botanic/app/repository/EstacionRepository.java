package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Estacion;

public interface EstacionRepository extends MongoRepository<Estacion, String> {
}
