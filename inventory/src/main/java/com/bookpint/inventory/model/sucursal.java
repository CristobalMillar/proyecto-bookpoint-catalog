package com.bookpint.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "sucursales")
@Data
public class sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSucursal;

    @Column(nullable = false)
    private String nombre;

    private String direccion;
    private String tipo;
    
}
