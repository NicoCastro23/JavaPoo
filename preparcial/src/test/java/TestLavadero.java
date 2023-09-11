import org.junit.jupiter.api.Test;

import com.preparcial.Contacto;
import com.preparcial.Registro;
import com.preparcial.TipoLavado;
import com.preparcial.TipoVehiculo;
import com.preparcial.Vehiculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class TestLavadero {
    private static final Logger LOG = Logger.getLogger( AppTest.class.getName());
    @Test
    void testName() {
        LOG.info("Iniciado test Datos correctos.....");
        Contacto contacto = new Contacto("jose", "jose@gmail.com", "32333333");
        Vehiculo vehiculo = new Vehiculo("AKG 222", TipoVehiculo.CAMIONETA, contacto);
        Registro registro = new Registro(LocalDateTime.of(2023, 5, 31, 14, 15, 0), LocalDateTime.of(2023, 5, 31, 18, 20, 0), TipoLavado.POLICHADO, vehiculo);
    
        assertEquals(222,registro.getPrecio());
    }

    
}
