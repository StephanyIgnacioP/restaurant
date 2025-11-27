package datos;

public interface MetodoPago {
    boolean procesarPago(double monto);
    String getNombre();
}