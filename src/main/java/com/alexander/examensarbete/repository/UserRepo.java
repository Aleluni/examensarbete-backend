package com.alexander.examensarbete.repository;

import com.alexander.examensarbete.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
}
