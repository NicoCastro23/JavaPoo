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

import com.MaquinaExpendedora;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger( AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCorrectos() {
        LOG.info("Iniciado test Datos correctos.....");
        MaquinaExpendedora maquinaExpendedora = new MaquinaExpendedora(1500, 1000);
        assertEquals(1000, maquinaExpendedora.getValorPagar());
        assertEquals(1500, maquinaExpendedora.getValorPagado());
        assertEquals(500, maquinaExpendedora.getDevuelta());
        LOG.info("Finalizando test Datos correctos.....");
        
    }
    @Test 
    public void datosNegativos(){
        LOG.info("Iniciado test Datos negativos.....");
        assertThrows(Throwable.class, ()-> new MaquinaExpendedora(-1500, -10000));
        LOG.info("Finalizando test Datos negativos.....");

    }
    @Test 
    public void datosPagarSuperior(){
        LOG.info("Iniciado test Datos pagar superior.....");
        assertThrows(Throwable.class, ()-> new MaquinaExpendedora(1000, 1500));
        LOG.info("Finalizando test Datos pagar superior.....");

    }
}