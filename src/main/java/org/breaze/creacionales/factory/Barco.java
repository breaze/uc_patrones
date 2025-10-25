package org.breaze.creacionales.factory;

public class Barco implements ITransporte {
    @Override
    public void entregar() {
        System.out.println("Entrega via maritima");
    }
}
