package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Planificacion;

public interface PlanificacionRepository extends MongoRepository<Planificacion, String> {
}
