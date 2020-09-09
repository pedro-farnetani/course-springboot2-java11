package com.educandoweb.webservice.repositories;

import com.educandoweb.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository - opcional pois esta classe herda de JpaRepository que ja tem o @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
