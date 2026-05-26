package com.bookpint.inventory.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookpint.inventory.model.inventario;

@Repository
public interface InventoryRepository extends JpaRepository<inventario, Long> {
    List<inventario> findByIdProducto(Long idProducto);
}
