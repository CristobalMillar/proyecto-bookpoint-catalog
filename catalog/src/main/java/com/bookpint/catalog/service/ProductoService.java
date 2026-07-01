package com.bookpint.catalog.service;

import com.bookpint.catalog.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.*;
import com.bookpint.catalog.client.InventarioClient;
import com.bookpint.catalog.model.producto;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
@Service

public class ProductoService {
    @Autowired 
    private ProductoRepository productoRepository;

    @Autowired
    private InventarioClient inventarioClient;

    public List<producto> listarTodos() {
        return productoRepository.findAll(); 
    }

    public Optional<producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    public producto guardar(producto producto) {
        return productoRepository.save(producto);
    }

    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }

    public Integer obtenerStock(Long idProducto) {
        try {
            return inventarioClient.obtenerStock(idProducto);
        } catch (Exception e) {
            // Manejar la excepción según sea necesario
            return 0; // o algún valor por defecto
        }   
    }
}
