import models.Carrito
import models.Producto
import services.CarritoService
import services.ProductoService
import utils.Interfaz

fun main() {
    // Inicializar productos y carrito
    val productos = listOf(
        Producto("Laptop", 1500.0, 10),
        Producto("Mouse", 25.0, 50),
        Producto("Teclado", 45.0, 20)
    )

    val carrito = Carrito()
    val carritoService = CarritoService(carrito)
    val productoService = ProductoService(productos)

    // Bucle para el menú principal
    var opcion = 0
    while (opcion != 6) {
        Interfaz.mostrarMenuPrincipal()
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> productoService.mostrarProductosDisponibles()
            2 -> {
                val producto = Interfaz.seleccionarProducto(productos)
                if (producto != null) {
                    val cantidad = Interfaz.seleccionarCantidad()
                    if (productoService.hayStockDisponible(producto, cantidad)) {
                        carritoService.agregarProductoAlCarrito(producto, cantidad)
                    } else {
                        println("Stock insuficiente para ${producto.nombre}.")
                    }
                }
            }
            3 -> {
                println("Ingrese el nombre del producto a eliminar: ")
                val nombre = readLine() ?: ""
                carritoService.eliminarProductoDelCarrito(nombre)
            }
            4 -> carritoService.mostrarContenidoDelCarrito()
            5 -> {
                // Generar factura
                println("Generando factura...")
                val total = carritoService.obtenerTotalCarrito()
                println("Total a pagar: $total")
                carritoService.vaciarCarrito()
            }
            6 -> Interfaz.mostrarDespedida()
            else -> println("Opción no válida. Inténtelo nuevamente.")
        }
    }
}
