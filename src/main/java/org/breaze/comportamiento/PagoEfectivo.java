package org.breaze.comportamiento;


public class PagoEfectivo implements IMetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con efectivo "+ monto);
    }
}
