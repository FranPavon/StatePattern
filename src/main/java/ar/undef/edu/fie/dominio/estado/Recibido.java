package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public class Recibido implements EstadoPaquete{

    @Override
    public void enviar(Paquete pqt) {
        System.out.println("El paquete ya fue entregado al destinatario");
    }

    @Override
    public void entregar(Paquete pqt) {
        System.out.println("El paquete ya fue entregado al destinatario.");    }

    @Override
    public void imprimirEstado() {
        System.out.println("El paquete entregado.");
    }
}

