package datos;

import java.util.Random;

public class PagoTarjeta implements MetodoPago {
    private String numeroTarjeta;
    
    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println(" Procesando pago con TARJETA...");
        System.out.println("   Tarjeta: **** **** **** " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        System.out.println("   Monto: Bs. " + String.format("%.2f", monto));
        System.out.println("   Conectando con banco...");
        System.out.println("   Validando tarjeta...");
        
        String codigoAutorizacion = generarCodigoAutorizacion();
        System.out.println("   Código de autorización: " + codigoAutorizacion);
        System.out.println("   Pago con tarjeta aprobado");
        return true;
    }
    
    @Override
    public String getNombre() {
        return "Tarjeta";
    }
    
    private String generarCodigoAutorizacion() {
        Random random = new Random();
        return String.format("%06d", random.nextInt(999999));
    }
}