import datos.*;
import negocio.*;
import presentacion.RestaurantUI;

public class Main {
    public static void main(String[] args) {
        PedidoDao pedidoDao = PedidoDaoImpl.getInstance();
        PedidoService pedidoService = new PedidoServiceImpl(pedidoDao);
        RestaurantUI ui = new RestaurantUI(pedidoService);
        ui.mostrarMenu();
    }
}