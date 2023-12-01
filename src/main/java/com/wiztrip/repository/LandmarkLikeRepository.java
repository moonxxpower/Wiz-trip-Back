package com.wiztrip.repository;

import com.wiztrip.domain.LandmarkEntity;
import com.wiztrip.domain.LandmarkLikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LandmarkLikeRepository extends JpaRepository<LandmarkLikeEntity,Long> {

}
