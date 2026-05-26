package com.bookpint.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookpint.inventory.model.sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<sucursal, Long> {
    
}
