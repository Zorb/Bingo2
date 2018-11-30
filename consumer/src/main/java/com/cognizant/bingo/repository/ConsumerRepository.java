package com.cognizant.bingo.repository;

import com.cognizant.bingo.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConsumerRepository extends MongoRepository<Account, Long> {

}