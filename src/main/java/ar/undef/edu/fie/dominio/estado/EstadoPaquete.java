package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public interface EstadoPaquete {

    void siguiente(Paquete pqt);
    void anterior(Paquete pqt);
    void imprimirEstado();
}
