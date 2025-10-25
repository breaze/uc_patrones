package org.breaze.creacionales.abstractfactory;

public class PlaneadorRutaMaritima implements IPlaneadorRuta {
    @Override
    public void planearRuta(String origen, String destino) {
        System.out.println("Planeando ruta maritima de " + origen + "-" + destino);
    }
}
