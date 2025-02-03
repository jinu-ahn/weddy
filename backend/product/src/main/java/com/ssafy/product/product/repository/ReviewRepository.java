package com.ssafy.product.product.repository;

import com.ssafy.product.product.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findByProductId(Long productId);
}
