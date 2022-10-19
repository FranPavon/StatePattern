package ar.undef.edu.fie;

import ar.undef.edu.fie.dominio.paquete.Paquete;

public class Main {
    public static void main(String[] args) {

        Paquete pqt = new Paquete();
        pqt.imprimirEstado();

        pqt.estadoSiguiente();
        pqt.imprimirEstado();

        pqt.estadoSiguiente();
        pqt.imprimirEstado();

        pqt.estadoSiguiente();
        pqt.imprimirEstado();
    }
}