package com.bezkoder.spring.mssql.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.mssql.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    List<Category> findByPublished(boolean published);
    List<Category> findByNameContaining(String name);
}