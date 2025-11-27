package negocio;

public class ConQuesoExtra extends PedidoDecorador {
    public ConQuesoExtra(Pedido pedidoBase) {
        super(pedidoBase);
    }
    
    @Override
    public double getPrecio() {
        return pedidoBase.getPrecio() + 8.00;
    }
    
    @Override
    public String getDescripcion() {
        return pedidoBase.getDescripcion() + " + Queso Extra";
    }
    
    @Override
    public void preparar() {
        pedidoBase.preparar();
        System.out.println(" Agregando QUESO EXTRA de primera calidad...");
    }
}