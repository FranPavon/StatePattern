package ar.undef.edu.fie.dominio.paquete;

import ar.undef.edu.fie.dominio.estado.Encargado;
import ar.undef.edu.fie.dominio.estado.Enviado;
import ar.undef.edu.fie.dominio.estado.Recibido;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaqueteTest {

    @Test
    @DisplayName("Los estados deben ser encargado -> enviado -> recibido.")
    public void cambioEstados() {
        Paquete pqt = new Paquete();

        assertTrue(pqt.getEstado() instanceof Encargado);
        pqt.enviarPaquete();

        assertTrue(pqt.getEstado() instanceof Enviado);
        pqt.entregarPaquete();

        assertTrue(pqt.getEstado() instanceof Recibido);
    }

    @Test
    @DisplayName("Un paquete encargado no puede ser entregado sin ser eviado previamente")
    public void cambioEstadoAnterior() {
        Paquete pqt = new Paquete();
        pqt.entregarPaquete();
        assertTrue(pqt.getEstado() instanceof Encargado);
    }
}
