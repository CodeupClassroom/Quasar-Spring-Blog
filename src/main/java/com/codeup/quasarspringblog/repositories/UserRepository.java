package com.codeup.quasarspringblog.repositories;

import com.codeup.quasarspringblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
