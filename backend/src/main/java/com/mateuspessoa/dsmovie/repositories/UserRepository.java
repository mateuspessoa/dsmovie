package com.mateuspessoa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateuspessoa.dsmovie.entities.Movie;
import com.mateuspessoa.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
