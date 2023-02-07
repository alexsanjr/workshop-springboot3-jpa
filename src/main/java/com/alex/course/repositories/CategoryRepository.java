package com.alex.course.repositories;

import com.alex.course.entities.Category;
import com.alex.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
