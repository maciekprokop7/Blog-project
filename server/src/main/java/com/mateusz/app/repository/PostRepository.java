package com.mateusz.app.repository;

import com.mateusz.app.domain.Post;
import com.mateusz.app.message.response.PostResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
