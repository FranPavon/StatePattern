package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public class Enviado implements EstadoPaquete{

    @Override
    public void siguiente(Paquete pqt) {
        pqt.setEstado(new Recibido());
    }

    @Override
    public void anterior(Paquete pqt) {
        pqt.setEstado(new Encargado());
    }

    @Override
    public void imprimirEstado() {
        System.out.println("Paquete en camino al destino final, todavía no fue entregado");
    }
}

