package org.breaze.estructurales.proxy;

public class ProxyPago implements IServicioPago {
    private PagoReal pagoReal;
    private boolean usuarioAutenticado;
    public ProxyPago(boolean usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    @Override
    public void pagar(double monto) {
        if (usuarioAutenticado) {
            if(pagoReal == null) {
                pagoReal = new PagoReal();
            }
            pagoReal.pagar(monto);
        }else{
            System.out.println("Acceso denegado");
        }
    }
}
