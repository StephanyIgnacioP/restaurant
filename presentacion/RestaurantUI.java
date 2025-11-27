package presentacion;

import negocio.*;
import datos.*;
import java.util.Scanner;

public class RestaurantUI {
    private PedidoService pedidoService;
    private Scanner scanner;
    
    public RestaurantUI(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
        this.scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        while (true) {
            System.out.println("\n╔═══════════════════════════════════════════════════╗");
            System.out.println("║    SISTEMA DE PEDIDOS DE RESTAURANTE             ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            System.out.println("1. Realizar Pedido");
            System.out.println("2. Ver Estadísticas");
            System.out.println("3. Salir");
            System.out.print("\nSeleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    realizarPedido();
                    break;
                case 2:
                    pedidoService.mostrarEstadisticas();
                    break;
                case 3:
                    System.out.println("\n¡Gracias por usar nuestro sistema!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
    
    private void realizarPedido() {
        System.out.println("\n--- TIPO DE PEDIDO ---");
        System.out.println("1. Desayuno (Bs. 35.00)");
        System.out.println("2. Almuerzo (Bs. 45.00)");
        System.out.println("3. Cena (Bs. 55.00)");
        System.out.print("Seleccione: ");
        int tipoPedido = scanner.nextInt();
        scanner.nextLine();
        
        TipoPedido tipo;
        switch (tipoPedido) {
            case 1:
                tipo = TipoPedido.DESAYUNO;
                break;
            case 2:
                tipo = TipoPedido.ALMUERZO;
                break;
            case 3:
                tipo = TipoPedido.CENA;
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }
        
        System.out.println("\n--- EXTRAS OPCIONALES ---");
        System.out.print("¿Agregar Queso Extra? (+Bs. 8.00) (s/n): ");
        boolean queso = scanner.nextLine().equalsIgnoreCase("s");
        
        System.out.print("¿Agregar Porción Extra? (+Bs. 15.00) (s/n): ");
        boolean porcion = scanner.nextLine().equalsIgnoreCase("s");
        
        System.out.print("¿Agregar Bebida Premium? (+Bs. 12.00) (s/n): ");
        boolean bebida = scanner.nextLine().equalsIgnoreCase("s");
        
        System.out.println("\n--- MÉTODO DE PAGO ---");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("3. Transferencia");
        System.out.print("Seleccione: ");
        int metodoPagoOpcion = scanner.nextInt();
        scanner.nextLine();
        
        MetodoPago metodoPago;
        switch (metodoPagoOpcion) {
            case 1:
                metodoPago = new PagoEfectivo();
                break;
            case 2:
                System.out.print("Ingrese número de tarjeta: ");
                String numeroTarjeta = scanner.nextLine();
                metodoPago = new PagoTarjeta(numeroTarjeta);
                break;
            case 3:
                System.out.print("Ingrese número de cuenta: ");
                String numeroCuenta = scanner.nextLine();
                metodoPago = new PagoTransferencia(numeroCuenta);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }
        
        System.out.println();
        pedidoService.procesarPedido(tipo, queso, porcion, bebida, metodoPago);
    }
}