package ar.undef.edu.fie.dominio.paquete;

import ar.undef.edu.fie.dominio.estado.Encargado;
import ar.undef.edu.fie.dominio.estado.EstadoPaquete;

public class Paquete {

    private EstadoPaquete estado = new Encargado();

    public EstadoPaquete getEstado() {
        return estado;
    }

    public void setEstado(EstadoPaquete estado) {
        this.estado = estado;
    }

    public void estadoAnterior() {
        estado.anterior(this);
    }

    public void estadoSiguiente() {
        estado.siguiente(this);
    }

    public void imprimirEstado() {
        estado.imprimirEstado();
    }
}

