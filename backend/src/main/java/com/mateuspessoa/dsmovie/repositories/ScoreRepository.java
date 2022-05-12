package com.mateuspessoa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateuspessoa.dsmovie.entities.Score;
import com.mateuspessoa.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	

}
