package org.breaze.estructurales.proxy;




public class PagoReal implements IServicioPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago de "+ monto);
    }
}
