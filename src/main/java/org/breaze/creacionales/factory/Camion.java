package org.breaze.creacionales.factory;

public class Camion implements ITransporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por carretera");
    }
}
