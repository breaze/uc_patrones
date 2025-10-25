package org.breaze.creacionales.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FabricaTransporte {
    private Map<TipoTransporte, Supplier<ITransporte>>  transportes = new HashMap<>();

    public FabricaTransporte(){
        transportes.put(TipoTransporte.CAMION, Camion::new);
        transportes.put(TipoTransporte.BARCO, Barco::new);
    }
    public ITransporte crearTransporte(TipoTransporte tipoTransporte){
        return transportes.get(tipoTransporte).get();
    }
}
