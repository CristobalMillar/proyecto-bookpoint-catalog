package com.bookpint.catalog.repository;

import com.bookpint.catalog.model.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<categoria, Long> {
    
}
