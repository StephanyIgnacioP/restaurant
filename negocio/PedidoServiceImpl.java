package negocio;

import datos.MetodoPago;
import datos.PedidoDao;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PedidoServiceImpl implements PedidoService {
    private PedidoDao pedidoDao;
    
    public PedidoServiceImpl(PedidoDao pedidoDao) {
        this.pedidoDao = pedidoDao;
    }
    
    @Override
    public void procesarPedido(TipoPedido tipoPedido,
                              boolean agregarQueso,
                              boolean agregarPorcion,
                              boolean agregarBebida,
                              MetodoPago metodoPago) {
        
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("         PROCESANDO NUEVO PEDIDO");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("Fecha: " + LocalDateTime.now()
                          .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println();
        
        Pedido pedido = FabricaPedidos.crearPedido(tipoPedido);
        System.out.println("✓ Pedido creado: " + pedido.getNombre());
        System.out.println();
        
        if (agregarQueso) {
            pedido = new ConQuesoExtra(pedido);
            System.out.println("✓ Agregado: Queso Extra (+Bs. 8.00)");
        }
        
        if (agregarPorcion) {
            pedido = new ConPorcionExtra(pedido);
            System.out.println("✓ Agregado: Porción Extra (+Bs. 15.00)");
        }
        
        if (agregarBebida) {
            pedido = new ConBebidaPremium(pedido);
            System.out.println("✓ Agregado: Bebida Premium (+Bs. 12.00)");
        }
        
        System.out.println();
        System.out.println("───────────────────────────────────────────────────────");
        System.out.println("RESUMEN DEL PEDIDO:");
        System.out.println("───────────────────────────────────────────────────────");
        pedido.mostrarResumen();
        System.out.println();
        
        System.out.println("───────────────────────────────────────────────────────");
        System.out.println("PREPARACIÓN:");
        System.out.println("───────────────────────────────────────────────────────");
        pedido.preparar();
        System.out.println(" Pedido completamente preparado!\n");
        
        System.out.println("───────────────────────────────────────────────────────");
        System.out.println("PROCESAMIENTO DE PAGO:");
        System.out.println("───────────────────────────────────────────────────────");
        boolean pagoExitoso = metodoPago.procesarPago(pedido.getPrecio());
        
        if (pagoExitoso) {
            pedidoDao.guardarPedido(pedido);
            System.out.println("\n ¡Pedido completado exitosamente!");
            System.out.println("═══════════════════════════════════════════════════════\n");
        }
    }
    
    @Override
    public void mostrarEstadisticas() {
        System.out.println("\n═══════════════════════════════════════════════════════");
        System.out.println("         ESTADÍSTICAS DEL SISTEMA");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("Total de pedidos procesados: " + pedidoDao.obtenerTotalPedidos());
        System.out.println("═══════════════════════════════════════════════════════\n");
    }
}