package negocio;

public class PedidoCena extends Pedido {
    public PedidoCena() {
        super("Cena Especial", 55.00, "Entrada, plato fuerte, postre gourmet, bebida");
    }
    
    @Override
    public void preparar() {
        System.out.println("🌙  Preparando CENA:");
        System.out.println("   - Preparando entrada (bruschetta)...");
        System.out.println("   - Cocinando plato fuerte (salmón al horno)...");
        System.out.println("   - Decorando el plato...");
        System.out.println("   - Preparando postre gourmet...");
        System.out.println("    Cena lista!");
    }
}