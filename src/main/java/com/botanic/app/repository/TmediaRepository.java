package com.botanic.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Tmedia;

public interface TmediaRepository extends MongoRepository<Tmedia, String> {
  /*  List<Tmedia> findByEstacionId(String estacionId);*/
}