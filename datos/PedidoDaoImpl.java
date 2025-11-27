package datos;

import negocio.Pedido;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidoDaoImpl implements PedidoDao {
    private static PedidoDaoImpl instance;
    private Map<Integer, Pedido> pedidos;
    private int contadorPedidos;
    
    private PedidoDaoImpl() {
        this.pedidos = new HashMap<>();
        this.contadorPedidos = 0;
    }
    
    public static PedidoDaoImpl getInstance() {
        if (instance == null) {
            instance = new PedidoDaoImpl();
        }
        return instance;
    }
    
    @Override
    public void guardarPedido(Pedido pedido) {
        contadorPedidos++;
        pedidos.put(contadorPedidos, pedido);
    }
    
    @Override
    public Pedido obtenerPedido(int id) {
        return pedidos.get(id);
    }
    
    @Override
    public List<Pedido> obtenerTodosPedidos() {
        return new ArrayList<>(pedidos.values());
    }
    
    @Override
    public int obtenerTotalPedidos() {
        return contadorPedidos;
    }
}