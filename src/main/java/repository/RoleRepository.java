package repository;

import models.ERole;
import models.Role;
import models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {

    Optional<User> findByName(ERole name);

}
