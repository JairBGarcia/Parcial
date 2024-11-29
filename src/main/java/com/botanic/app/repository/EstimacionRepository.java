package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Estimacion;

public interface EstimacionRepository extends MongoRepository<Estimacion, String> {
}
