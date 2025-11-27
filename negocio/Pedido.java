package negocio;

public abstract class Pedido {
    protected String nombre;
    protected double precioBase;
    protected String descripcion;
    
    public Pedido(String nombre, double precioBase, String descripcion) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.descripcion = descripcion;
    }
    
    public abstract void preparar();
    
    public double getPrecio() {
        return precioBase;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void mostrarResumen() {
        System.out.println("   " + nombre);
        System.out.println("      " + descripcion);
        System.out.println("      Precio: Bs. " + String.format("%.2f", getPrecio()));
    }
}