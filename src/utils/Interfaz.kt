package utils

import models.Producto
import models.Carrito

object Interfaz {

    // Función para mostrar el menú principal
    fun mostrarMenuPrincipal() {
        println("\n--- Menú Principal ---")
        println("1. Ver productos disponibles")
        println("2. Agregar producto al carrito")
        println("3. Eliminar producto del carrito")
        println("4. Ver carrito")
        println("5. Generar factura y pagar")
        println("6. Salir")
        println("Seleccione una opción: ")
    }

    // Función para mostrar los productos disponibles en la tienda
    fun mostrarProductos(productos: List<Producto>) {
        if (productos.isEmpty()) {
            println("No hay productos disponibles.")
        } else {
            println("\n--- Productos Disponibles ---")
            productos.forEachIndexed { index, producto ->
                println("${index + 1}. ${producto.nombre} - Precio: ${producto.precio} - Cantidad en stock: ${producto.cantidadDisponible}")
            }
        }
    }

    // Función para capturar la selección del usuario de un producto
    fun seleccionarProducto(productos: List<Producto>): Producto? {
        mostrarProductos(productos)
        println("Seleccione el número del producto que desea agregar (o 0 para volver): ")
        val seleccion = readLine()?.toIntOrNull() ?: return null

        return if (seleccion in 1..productos.size) {
            productos[seleccion - 1]
        } else {
            println("Selección inválida.")
            null
        }
    }

    // Función para capturar la cantidad deseada por el usuario
    fun seleccionarCantidad(): Int {
        println("Ingrese la cantidad deseada: ")
        return readLine()?.toIntOrNull() ?: 0
    }

    // Función para mostrar el mensaje final de despedida
    fun mostrarDespedida() {
        println("Gracias por usar el sistema de carrito de compras. ¡Hasta luego!")
    }
}
