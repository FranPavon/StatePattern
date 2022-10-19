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
        pqt.estadoSiguiente();

        assertTrue(pqt.getEstado() instanceof Enviado);
        pqt.estadoSiguiente();

        assertTrue(pqt.getEstado() instanceof Recibido);
    }

    @Test
    @DisplayName("Dado un paquete enviado al volver al estado anterior cambia a encargado")
    public void cambioEstadoAnterior() {
        Paquete pqt = new Paquete();
        pqt.setEstado(new Enviado());
        pqt.estadoAnterior();

        assertTrue(pqt.getEstado() instanceof Encargado);
    }
}
