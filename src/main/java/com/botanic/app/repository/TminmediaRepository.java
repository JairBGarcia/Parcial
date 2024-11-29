package com.botanic.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Tminmedia;

public interface TminmediaRepository extends MongoRepository<Tminmedia, String>  {
  /*  List<Tminmedia> findByEstacionId(String estacionId);*/
}