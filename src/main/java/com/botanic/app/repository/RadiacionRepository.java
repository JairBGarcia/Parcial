package com.botanic.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Radiacion;

public interface RadiacionRepository extends MongoRepository<Radiacion, String> {
  /*  List<Radiacion> findByEstacionId(String estacionId);*/
}