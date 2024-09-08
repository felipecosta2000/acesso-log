package com.felipe.costa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felipe.costa.model.Users;

public interface UsersRepository extends MongoRepository<Users,String> {

    public Users findByEmail(String email);


}
