package com.bookpint.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bookpint.catalog.model.producto;
import com.bookpint.catalog.repository.ProductoRepository;


@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List <producto> listarProductos() {
        return productoRepository.findAll();    
    }

    @GetMapping("/{id}")
    public ResponseEntity<producto> obtenerPorId(@PathVariable Long id) {
        return productoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public producto crear(@RequestBody producto producto) {
        return productoRepository.save(producto);
    }
}
