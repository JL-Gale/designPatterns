public class PagoPaypal implements Pago{
    @Override
    public void crearPago(){
        System.out.println("Pago realizo con exito\n"+"Metodo usado: Paypal");
    }
}
