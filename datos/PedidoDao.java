package datos;

import negocio.Pedido;
import java.util.List;

public interface PedidoDao {
    void guardarPedido(Pedido pedido);
    Pedido obtenerPedido(int id);
    List<Pedido> obtenerTodosPedidos();
    int obtenerTotalPedidos();
}