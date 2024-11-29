package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Evapotranspiracion;

public interface EvapotranspiracionRepository extends MongoRepository<Evapotranspiracion, String> {
}
