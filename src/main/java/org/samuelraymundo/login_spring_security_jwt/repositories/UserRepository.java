package org.samuelraymundo.login_spring_security_jwt.repositories;

import org.samuelraymundo.login_spring_security_jwt.models.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
