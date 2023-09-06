/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

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
        Paciente paciente = new Paciente("poloncia", 80.0, (byte) 18,  1.80, LocalDate.of(2005, 07, 14) );
        assertEquals("poloncia", paciente.getName());
        assertEquals(80.0, paciente.getWeight());
        assertEquals(18, paciente.getAge());
        assertEquals(1.80, paciente.getEstatura());
        assertEquals(LocalDate.of(2005, 07, 14), paciente.getBirtDay());
        LOG.info("Finalizando test Datos correctos.....");
    }