package org.breaze.creacionales.abstractfactory;

public class Camion implements ITransporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por camion");
    }
}
