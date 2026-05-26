package com.bookpint.inventory.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "inventarios")
@Data
public class inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInventario;

    @Column(nullable = false)
    private Long idProducto;

    @Column(nullable = false)
    private Integer cantidadDisponible;

    private Integer stockMinimo;

    @ManyToOne
    @JoinColumn(name = "idSucursal", nullable = false)
    private sucursal sucursal;

    
}
