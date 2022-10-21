package ar.undef.edu.fie.dominio.estado;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public class Enviado implements EstadoPaquete{

    @Override
    public void enviar(Paquete pqt) {
        System.out.println("Paquete sigue en camino al destino final, todavía no fue entregado");
    }

    @Override
    public void entregar(Paquete pqt) {
        pqt.setEstado(new Recibido());
    }

    @Override
    public void imprimirEstado() {
        System.out.println("Paquete en camino al destino final, todavía no fue entregado");
    }
}

