package com.bookpint.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.bookpint.inventory.model.inventario;
import com.bookpint.inventory.repository.InventoryRepository;

@RestController
@RequestMapping("/api/inventarios")
public class InventarioController {
    
    @Autowired
    private InventoryRepository inventoryRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping
    public List<inventario> listarInventarios() {
        return inventoryRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> crearInventario(@RequestBody inventario inventario) {
        String urlCatalog = "http://localhost:8081/api/productos/" + inventario.getIdProducto();

        try {
            ResponseEntity<Object> response = restTemplate.getForEntity(urlCatalog, Object.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                inventario nuevoInventario = inventoryRepository.save(inventario);
                return ResponseEntity.status(HttpStatus.CREATED).body(nuevoInventario);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el inventario");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Producto no encontrado");
        
    }

    @GetMapping("/producto/{idProducto}")
    public List<inventario> obtenerInventariosPorProducto(@PathVariable Long idProducto) {
        return inventoryRepository.findByIdProducto(idProducto);
    }
}
 