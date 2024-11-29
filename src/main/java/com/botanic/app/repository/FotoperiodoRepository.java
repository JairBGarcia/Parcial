package com.botanic.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Fotoperiodo;


public interface FotoperiodoRepository extends MongoRepository<Fotoperiodo, String> {

	List<Fotoperiodo> findByFechaBetween(int yearStart, int yearEnd);
 
}
