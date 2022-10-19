package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public class Encargado implements EstadoPaquete {

    @Override
    public void siguiente(Paquete pqt) {
        pqt.setEstado(new Enviado());
    }

    @Override
    public void anterior(Paquete pqt) {
        System.out.println("El paquete está encargado, no tiene estado anterior");
    }

    @Override
    public void imprimirEstado() {
        System.out.println("Paquete encargado, todavía no fue enviado.");
    }
}
