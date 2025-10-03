package com.rai.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rai.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
