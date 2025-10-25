package org.breaze.creacionales.abstractfactory;

public class Barco implements ITransporte{

    @Override
    public void entregar() {
        System.out.println("Entrega por barco");
    }
}
