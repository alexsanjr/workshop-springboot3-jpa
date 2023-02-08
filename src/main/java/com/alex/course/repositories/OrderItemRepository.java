package com.alex.course.repositories;

import com.alex.course.entities.OrderItem;
import com.alex.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
