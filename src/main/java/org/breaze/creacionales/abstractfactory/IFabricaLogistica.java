package org.breaze.creacionales.abstractfactory;

import org.breaze.creacionales.factory.ITransporte;

public interface IFabricaLogistica {
    ITransporte crearTransporte();
    IPlaneadorRuta crearPlaneadorRuta();
}
