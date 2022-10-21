package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public interface EstadoPaquete {

    void enviar(Paquete pqt);
    void entregar(Paquete pqt);
    void imprimirEstado();
}
