package com.timeTableManagement.repository;

import com.timeTableManagement.models.ERole;
import com.timeTableManagement.models.Role;
import com.timeTableManagement.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {

    Optional<Role> findByName(ERole name);

}
