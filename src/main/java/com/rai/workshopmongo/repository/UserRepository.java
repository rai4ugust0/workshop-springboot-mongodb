package com.rai.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rai.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
