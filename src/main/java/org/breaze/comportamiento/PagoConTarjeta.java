package org.breaze.comportamiento;


public class PagoConTarjeta implements IMetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con Tarjeta "+ monto);
    }
}
