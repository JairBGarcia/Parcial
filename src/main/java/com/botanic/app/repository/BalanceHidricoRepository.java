package com.botanic.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.botanic.app.entity.BalanceHidrico;

public interface BalanceHidricoRepository extends MongoRepository<BalanceHidrico, String> {
}
