package com.bookpint.catalog.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String titulo;
    private String autor;
    private String editorial;
    private Double precio;

    @Column(length = 500)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private categoria categoria;
}
