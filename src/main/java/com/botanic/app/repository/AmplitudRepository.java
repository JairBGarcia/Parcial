package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Amplitud;

public interface AmplitudRepository extends MongoRepository<Amplitud, String> {
}
