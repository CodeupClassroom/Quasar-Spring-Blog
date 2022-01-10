package com.codeup.quasarspringblog.repositories;

import com.codeup.quasarspringblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
