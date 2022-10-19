package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public class Recibido implements EstadoPaquete{

    @Override
    public void siguiente(Paquete pqt) {
        System.out.println("El paquete ya fue entregado al destinatario, no tiene un estado posterior.");
    }

    @Override
    public void anterior(Paquete pqt) {
        pqt.setEstado(new Enviado());
    }

    @Override
    public void imprimirEstado() {
        System.out.println("El paquete entregado.");
    }
}

