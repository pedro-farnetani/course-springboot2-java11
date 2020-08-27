package com.educandoweb.webservice.repositories;

import com.educandoweb.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
