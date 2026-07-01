package com.bookpint.catalog.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventario")

public class InventarioClient {
    @GetMapping("/api/inventario/{idProducto}")
    public Integer obtenerStock(@PathVariable Long idProducto) {
        // Lógica para llamar al servicio de inventario y obtener el stock
        return 0; // Retorna un valor de stock simulado por ahora
    }
}
