package org.breaze.creacionales.abstractfactory;

import org.breaze.creacionales.factory.Barco;
import org.breaze.creacionales.factory.ITransporte;

public class FabricaLogisticaMaritima implements IFabricaLogistica {
    @Override
    public ITransporte crearTransporte() {
        return new Barco();
    }

    @Override
    public IPlaneadorRuta crearPlaneadorRuta() {
        return new PlaneadorRutaMaritima();
    }
}
