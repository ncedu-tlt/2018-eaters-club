package com.netcracker.eaters.repository;

import com.netcracker.eaters.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail (String email);
}
