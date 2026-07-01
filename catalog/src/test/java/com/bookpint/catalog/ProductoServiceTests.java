package com.bookpint.catalog;

import com.bookpint.catalog.client.InventarioClient;
import com.bookpint.catalog.model.producto;
import com.bookpint.catalog.repository.ProductoRepository;
import com.bookpint.catalog.service.ProductoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ProductoServiceTests {
    @Mock
    private ProductoRepository productoRepository;
    @Mock
    private InventarioClient inventarioClient;
    @InjectMocks
    private ProductoService productoService;

    @Test
    public void testListarTodos() {
        producto producto1 = mock(producto.class);
        when(producto1.getTitulo()).thenReturn("Libro de prueba");
        when(productoRepository.findAll()).thenReturn(Arrays.asList(producto1));

        List<producto> resultado = productoService.listarTodos();
        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        assertEquals("Libro de prueba", resultado.get(0).getTitulo());

        verify(productoRepository, times(1)).findAll();
    }

    @Test
    public void testObtenerStockDelProducto() {
        when(inventarioClient.obtenerStock(1L)).thenReturn(15);

        Integer stock = productoService.obtenerStock(1L);
        assertEquals(15, stock);
        verify(inventarioClient, times(1)).obtenerStock(1L);
    }
}