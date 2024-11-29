package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.RegimenHidrico;

public interface RegimenHidricoRepository extends MongoRepository<RegimenHidrico, String> {
}
