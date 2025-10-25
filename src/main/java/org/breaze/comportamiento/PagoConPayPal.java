package org.breaze.comportamiento;



public class PagoConPayPal implements IMetodoPago{
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con PayPal "+ monto);
    }
}
