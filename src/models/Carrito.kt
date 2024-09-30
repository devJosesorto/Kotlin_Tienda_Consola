package models

class Carrito{
    private val productosEnCarrito: MutableList<ProductoEnCarrito> = mutableListOf()

    // Clase interna para representar los productos agregados al carrito junto con su cantidad
    data class ProductoEnCarrito(
        val producto: Producto,
        var cantidad: Int
    ) {
        val precioTotal: Double
            get() = producto.precio * cantidad  // Precio total del producto en base a la cantidad
    }

    // Función para agregar un producto al carrito
    fun agregarProducto(producto: Producto, cantidad: Int) {
        if (producto.cantidadDisponible >= cantidad) {
            producto.reducirStock(cantidad)
            val productoExistente = productosEnCarrito.find { it.producto.nombre == producto.nombre }
            if (productoExistente != null) {
                productoExistente.cantidad += cantidad  // Si ya existe en el carrito, solo actualiza la cantidad
            } else {
                productosEnCarrito.add(ProductoEnCarrito(producto, cantidad))  // Si no existe, lo agrega
            }
        } else {
            println("No hay suficiente stock disponible para agregar $cantidad ${producto.nombre}.")
        }
    }

    // Función para eliminar un producto del carrito
    fun eliminarProducto(nombreProducto: String) {
        val productoEnCarrito = productosEnCarrito.find { it.producto.nombre == nombreProducto }
        if (productoEnCarrito != null) {
            productoEnCarrito.producto.aumentarStock(productoEnCarrito.cantidad)  // Devolver stock al inventario
            productosEnCarrito.remove(productoEnCarrito)  // Remover del carrito
            println("$nombreProducto ha sido eliminado del carrito.")
        } else {
            println("El producto $nombreProducto no está en el carrito.")
        }
    }

    // Función para mostrar los productos en el carrito y el total general
    fun mostrarCarrito() {
        if (productosEnCarrito.isEmpty()) {
            println("El carrito está vacío.")
        } else {
            println("Productos en el carrito:")
            productosEnCarrito.forEach {
                println("${it.producto.nombre} - Cantidad: ${it.cantidad}, Precio unitario: ${it.producto.precio}, Total: ${it.precioTotal}")
            }
            println("Total general: ${calcularTotal()}")
        }
    }

    // Función para calcular el total general del carrito
    fun calcularTotal(): Double {
        return productosEnCarrito.sumOf { it.precioTotal }
    }

    // Función para vaciar el carrito (por ejemplo, después de una compra)
    fun vaciarCarrito() {
        productosEnCarrito.clear()
        println("El carrito ha sido vaciado.")
    }
}

