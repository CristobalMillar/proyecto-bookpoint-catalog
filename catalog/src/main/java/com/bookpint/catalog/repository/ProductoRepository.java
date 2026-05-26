package com.bookpint.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookpint.catalog.model.producto;

@Repository
public interface ProductoRepository extends JpaRepository<producto, Long> {
    
}
