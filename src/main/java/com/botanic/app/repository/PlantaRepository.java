package com.botanic.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Planta;

public interface PlantaRepository extends MongoRepository<Planta, String>{
	List<Planta> findTop5ByOrderByBusquedasDesc();
}
