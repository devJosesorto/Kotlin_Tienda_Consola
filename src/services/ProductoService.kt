package services

import models.Producto
import utils.Interfaz

class ProductoService(private val productos: List<Producto>) {

    // Función para mostrar todos los productos disponibles
    fun mostrarProductosDisponibles() {
        Interfaz.mostrarProductos(productos)
    }

    // Función para buscar un producto por nombre
    fun buscarProductoPorNombre(nombre: String): Producto? {
        return productos.find { it.nombre.equals(nombre, ignoreCase = true) }
    }

    // Función para reducir el stock de un producto después de agregar al carrito
    fun reducirStockProducto(producto: Producto, cantidad: Int) {
        try {
            producto.reducirStock(cantidad)
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        }
    }

    // Función para verificar si hay stock suficiente para un producto
    fun hayStockDisponible(producto: Producto, cantidad: Int): Boolean {
        return producto.cantidadDisponible >= cantidad
    }
}
