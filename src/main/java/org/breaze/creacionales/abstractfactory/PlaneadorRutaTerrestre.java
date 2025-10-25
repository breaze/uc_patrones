package org.breaze.creacionales.abstractfactory;

public class PlaneadorRutaTerrestre implements IPlaneadorRuta {
    @Override
    public void planearRuta(String origen, String destino) {
        System.out.println("Planeando ruta terrestre de " + origen + "-" + destino);
    }
}
