package com.wiztrip.repository;

import com.wiztrip.domain.ReviewImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewImageRepository extends JpaRepository<ReviewImageEntity,Long> {
    boolean existsByImageName(String imageName);
}