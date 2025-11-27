package datos;

public class PagoEfectivo implements MetodoPago {
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago en EFECTIVO...");
        System.out.println("   Monto recibido: Bs. " + String.format("%.2f", monto));
        System.out.println("   Calculando cambio...");
        System.out.println("   Pago en efectivo completado!!");
        return true;
    }
    
    @Override
    public String getNombre() {
        return "Efectivo";
    }
}