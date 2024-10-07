package com.galdino.picpaysimplificadoRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galdino.picpaysimplificadoUser.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUserByDocument(String document);
	
	Optional<User> findUserById(Long id);


}
