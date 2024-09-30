package services

import models.Carrito
import models.Producto
import utils.Interfaz

class CarritoService(private val carrito: Carrito) {

    // Función para agregar un producto al carrito
    fun agregarProductoAlCarrito(producto: Producto, cantidad: Int) {
        if (producto.cantidadDisponible >= cantidad) {
            carrito.agregarProducto(producto, cantidad)
            println("Se ha agregado $cantidad unidad(es) de ${producto.nombre} al carrito.")
        } else {
            println("No hay suficiente stock disponible para agregar $cantidad unidad(es) de ${producto.nombre}.")
        }
    }

    // Función para eliminar un producto del carrito por su nombre
    fun eliminarProductoDelCarrito(nombreProducto: String) {
        carrito.eliminarProducto(nombreProducto)
    }

    // Función para mostrar el contenido actual del carrito
    fun mostrarContenidoDelCarrito() {
        carrito.mostrarCarrito()
    }

    // Función para calcular el total del carrito
    fun obtenerTotalCarrito(): Double {
        return carrito.calcularTotal()
    }

    // Función para vaciar el carrito después de una compra
    fun vaciarCarrito() {
        carrito.vaciarCarrito()
    }
}
