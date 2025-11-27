package negocio;

public class PedidoDesayuno extends Pedido {
    public PedidoDesayuno() {
        super("Desayuno Completo", 35.00, "Café, pan, huevos, jugo");
    }
    
    @Override
    public void preparar() {
        System.out.println("  Preparando DESAYUNO:");
        System.out.println("   - Preparando café recién hecho...");
        System.out.println("   - Tostando pan fresco...");
        System.out.println("   - Cocinando huevos al gusto...");
        System.out.println("   - Sirviendo jugo natural...");
        System.out.println("   Desayuno listo!");
    }
}