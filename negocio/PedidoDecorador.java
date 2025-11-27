package negocio;

public abstract class PedidoDecorador extends Pedido {
    protected Pedido pedidoBase;
    
    public PedidoDecorador(Pedido pedidoBase) {
        super(pedidoBase.getNombre(), pedidoBase.getPrecio(), pedidoBase.getDescripcion());
        this.pedidoBase = pedidoBase;
    }
    
    @Override
    public void preparar() {
        pedidoBase.preparar();
    }
}