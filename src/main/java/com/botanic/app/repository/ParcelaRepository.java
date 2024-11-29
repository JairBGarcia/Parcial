package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Parcela;

public interface ParcelaRepository extends MongoRepository<Parcela, String> {
}
