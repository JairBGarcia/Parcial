package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.Administrador;

public interface AdministradorRepository extends MongoRepository<Administrador, String> {

}
