package com.bookpint.catalog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.cloud.openfeign.EnableFeignClients;
import com.bookpint.catalog.model.categoria;
import com.bookpint.catalog.model.producto;
import com.bookpint.catalog.repository.CategoriaRepository;
import com.bookpint.catalog.repository.ProductoRepository;

@SpringBootApplication
@EnableFeignClients

public class CatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogApplication.class, args);
	}

	@Bean
	public CommandLineRunner cargarDatosDePrueba(CategoriaRepository catRepo, ProductoRepository prodRepo) {
		return args -> {
			//crear categoria
			if (catRepo.count() == 0) {
				categoria ingeneria = new categoria();
				ingeneria.setNombre("Ingeniería");
				ingeneria.setDescripcion("Libros relacionados con la ingeniería y tecnología.");
				catRepo.save(ingeneria);

				//Creacion de un producto de categoria
				producto libro = new producto();
				libro.setTitulo("Patrones de Diseño");
				libro.setAutor("Chris Mill");
				libro.setEditorial("BookPoint Edge");
				libro.setIsbn("978-0201633610");
				libro.setPrecio(29.99);
				libro.setDescripcion("Un libro esencial para desarrolladores de software que cubre los patrones de diseño más importantes.");
				libro.setCategoria(ingeneria);

				prodRepo.save(libro);

				System.out.println("Datos de prueba cargados en la base de datos. Libro ID: " + libro.getIdProducto());
			}
		};
	}
}
