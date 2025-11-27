package negocio;

import datos.MetodoPago;

public interface PedidoService {
    void procesarPedido(TipoPedido tipoPedido, 
                       boolean agregarQueso,
                       boolean agregarPorcion,
                       boolean agregarBebida,
                       MetodoPago metodoPago);
    
    void mostrarEstadisticas();
}