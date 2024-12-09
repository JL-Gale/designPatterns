public class PagoTarjetaCredito implements Pago{
    @Override
    public void crearPago(){
        System.out.println("Pago realizo con exito\n"+"Metodo usado: Tarjeta de credito");
    }
}
