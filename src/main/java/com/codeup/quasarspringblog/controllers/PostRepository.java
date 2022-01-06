package com.codeup.quasarspringblog.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
