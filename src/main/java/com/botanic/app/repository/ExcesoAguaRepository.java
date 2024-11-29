package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.ExcesoAgua;

public interface ExcesoAguaRepository extends MongoRepository<ExcesoAgua, String> {
}
