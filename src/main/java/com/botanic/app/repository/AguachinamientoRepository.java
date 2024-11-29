package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Aguachinamiento;

public interface AguachinamientoRepository extends MongoRepository<Aguachinamiento, String> {
}
