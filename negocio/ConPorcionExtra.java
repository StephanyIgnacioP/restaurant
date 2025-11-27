package negocio;

public class ConPorcionExtra extends PedidoDecorador {
    public ConPorcionExtra(Pedido pedidoBase) {
        super(pedidoBase);
    }
    
    @Override
    public double getPrecio() {
        return pedidoBase.getPrecio() + 15.00;
    }
    
    @Override
    public String getDescripcion() {
        return pedidoBase.getDescripcion() + " + Porción Extra";
    }
    
    @Override
    public void preparar() {
        pedidoBase.preparar();
        System.out.println(" Agregando PORCIÓN EXTRA (doble cantidad)...");
    }
}