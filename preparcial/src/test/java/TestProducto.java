/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import com.preparcial.Marca;
import com.preparcial.Producto;
import com.preparcial.TipoProducto;

/**
 * Unit test for simple App.
 */
public class TestProducto {
    private static final Logger LOG = Logger.getLogger( TestProducto.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCorrectos() {
        LOG.info("Iniciado test Datos correctos.....");
        
        Marca marca = new Marca("jose", "www.jose.com", "jose@gmail.com");
        Producto producto = new Producto("jose", LocalDate.of(2023, 9, 6), 500000, marca, TipoProducto.IMPORTADO);
        assertEquals("jose", producto.getName());
        assertEquals(LocalDate.of(2023, 9, 6), producto.getFechaVencimiento());
        assertEquals(500000, producto.getPrecio());
        assertEquals(TipoProducto.IMPORTADO, producto.getTipoProducto());
        assertEquals("jose", marca.getName());
        assertEquals("www.jose.com", marca.getWeb());
        assertEquals("jose@gmail.com", marca.getEmail());
        
        LOG.info("Finalizando test Datos correctos.....");
        
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test Datos correctos.....");
        
        assertThrows(Throwable.class, ()-> new Producto(null, null, 500000, null, null));
        assertThrows(Throwable.class, ()-> new Marca(null, null, null));
        LOG.info("Finalizando test Datos correctos.....");
        }

        @Test
    public void datosNegativos() {
        LOG.info("Iniciado test Datos negativos.....");

        Marca marca = new Marca("jose", "www.jose.com", "jose@gmail.com");
        assertThrows(Throwable.class, ()-> new Producto("jose", LocalDate.of(2023, 9, 6), -500000, marca , TipoProducto.IMPORTADO));
        
        LOG.info("Finalizando test Datos negativos.....");
        }

}