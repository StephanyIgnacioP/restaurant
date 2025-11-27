package negocio;

public class PedidoAlmuerzo extends Pedido {
    public PedidoAlmuerzo() {
        super("Almuerzo Ejecutivo", 45.00, "Sopa, plato principal, postre, refresco");
    }
    
    @Override
    public void preparar() {
        System.out.println("  Preparando ALMUERZO:");
        System.out.println("   - Calentando sopa del día...");
        System.out.println("   - Cocinando plato principal (pollo con arroz)...");
        System.out.println("   - Preparando ensalada fresca...");
        System.out.println("   - Sirviendo postre...");
        System.out.println("    Almuerzo listo!");
    }
}