package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Precipitacion;

public interface PrecipitacionRepository extends MongoRepository<Precipitacion, String> {
}
