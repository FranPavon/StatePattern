package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public class Encargado implements EstadoPaquete {

    @Override
    public void enviar(Paquete pqt) {
        pqt.setEstado(new Enviado());
    }

    @Override
    public void entregar(Paquete pqt) {
        System.out.println("El paquete está encargado, debe ser enviado antes de entregarlo.");
    }

    @Override
    public void imprimirEstado() {
        System.out.println("Paquete encargado, todavía no fue enviado.");
    }
}
