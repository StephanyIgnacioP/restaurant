package negocio;

public class ConBebidaPremium extends PedidoDecorador {
    public ConBebidaPremium(Pedido pedidoBase) {
        super(pedidoBase);
    }
    
    @Override
    public double getPrecio() {
        return pedidoBase.getPrecio() + 12.00;
    }
    
    @Override
    public String getDescripcion() {
        return pedidoBase.getDescripcion() + " + Bebida Premium";
    }
    
    @Override
    public void preparar() {
        pedidoBase.preparar();
        System.out.println(" Agregando BEBIDA PREMIUM (jugo natural o smoothie)...");
    }
}