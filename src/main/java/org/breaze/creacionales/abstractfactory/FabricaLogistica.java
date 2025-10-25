package org.breaze.creacionales.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FabricaLogistica {
    private Map<TipoLogistica, Supplier<IFabricaLogistica>> fabrica = new HashMap<>();

    public FabricaLogistica() {
        fabrica.put(TipoLogistica.TERRESTRE, FabricaLogisticaTerrestre::new);
        fabrica.put(TipoLogistica.MARITIMA, FabricaLogisticaMaritima::new);
    }

    public IFabricaLogistica crear(TipoLogistica tipoLogistica) {
        return this.fabrica.get(tipoLogistica).get();
    }
}
