package org.breaze.comportamiento;

public class Compra {
    private IMetodoPago metodoPago;

    public void setMetodoPago(IMetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void finalizarCompra(double monto) {
        if(metodoPago == null) {
            System.out.println("No selecciono metodo de pago");
        } else{
            metodoPago.pagar(monto);
        }
    }
}
