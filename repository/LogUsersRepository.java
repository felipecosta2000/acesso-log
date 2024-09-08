package com.felipe.costa.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felipe.costa.model.LogUsers;

public interface  LogUsersRepository extends MongoRepository<LogUsers,String> {

    public List<LogUsers> findByUsersId(String usersId);


}
