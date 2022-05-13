package com.alexander.examensarbete.repository;

import com.alexander.examensarbete.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<User,String> {

    @Query("{ 'username' : ?0 }")
    Optional<User> findByUserName(String userName);

    @Query("{ 'email' : ?0 }")
    Optional<User> findByEmailAddress(String email);

}
