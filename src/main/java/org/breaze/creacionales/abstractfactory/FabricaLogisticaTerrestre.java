package org.breaze.creacionales.abstractfactory;

import org.breaze.creacionales.factory.Camion;
import org.breaze.creacionales.factory.ITransporte;

public class FabricaLogisticaTerrestre implements IFabricaLogistica {
    @Override
    public ITransporte crearTransporte() {
        return new Camion();
    }

    @Override
    public IPlaneadorRuta crearPlaneadorRuta() {
        return new PlaneadorRutaTerrestre();
    }
}
