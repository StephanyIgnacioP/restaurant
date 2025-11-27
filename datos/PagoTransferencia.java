package datos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PagoTransferencia implements MetodoPago {
    private String numeroCuenta;
    
    public PagoTransferencia(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("🏦 Procesando pago por TRANSFERENCIA...");
        System.out.println("   Cuenta destino: " + numeroCuenta);
        System.out.println("   Monto: Bs. " + String.format("%.2f", monto));
        System.out.println("   Verificando cuenta bancaria...");
        
        String referencia = generarReferencia();
        System.out.println("   Referencia de transferencia: " + referencia);
        System.out.println("   Transferencia completada");
        return true;
    }
    
    @Override
    public String getNombre() {
        return "Transferencia";
    }
    
    private String generarReferencia() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return "TRF-" + timestamp;
    }
}