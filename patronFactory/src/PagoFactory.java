public class PagoFactory {

    public Pago obtenerPago(TipoDePago tipoDePago) throws NoSuchFieldException {
        if (tipoDePago == TipoDePago.APPLE_PAY) {
            return new PagoApplePay();
        } else if (tipoDePago == TipoDePago.BITCOIN) {
            return new PagoBitcoin();
        } else if (tipoDePago == TipoDePago.EFECTIVO) {
            return new PagoEfectivo();
        } else if (tipoDePago == TipoDePago.GOOGLE_PLAY) {
            return new PagoGooglePlay();
        } else if (tipoDePago == TipoDePago.PAYPAL) {
            return new PagoPaypal();
        } else if (tipoDePago == TipoDePago.TARJETA_CREDITO) {
            return new PagoTarjetaCredito();
        } else if (tipoDePago == TipoDePago.TRAJETA_DEBITO) {
            return new PagoTarjetaCredito();
        } else if (tipoDePago == TipoDePago.TRASFERENCIA_BANCARIA) {
            return new PagoTrasferenciaBancaria();
        } else {
            throw new NoSuchFieldException("Tipo de pago no encontrado");
        }

    }
}
