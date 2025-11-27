package negocio;

public class FabricaPedidos {
    public static Pedido crearPedido(TipoPedido tipo) {
        switch (tipo) {
            case DESAYUNO:
                return new PedidoDesayuno();
            case ALMUERZO:
                return new PedidoAlmuerzo();
            case CENA:
                return new PedidoCena();
            default:
                throw new IllegalArgumentException("Tipo de pedido no válido");
        }
    }
}