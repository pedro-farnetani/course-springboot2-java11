package com.educandoweb.webservice.repositories;

import com.educandoweb.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository - opcional pois esta classe herda de JpaRepository que ja tem o @Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
