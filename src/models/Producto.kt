package models

data class Producto(
    val nombre: String,  // Nombre del producto
    val precio: Double,  // Precio del producto
    var cantidadDisponible: Int  // Cantidad disponible en stock
) {
    // Método para reducir la cantidad disponible del producto
    fun reducirStock(cantidad: Int) {
        if (cantidad > cantidadDisponible) {
            throw IllegalArgumentException("No hay suficiente stock disponible.")
        }
        cantidadDisponible -= cantidad
    }

    // Método para aumentar la cantidad disponible del producto (en caso de devoluciones, por ejemplo)
    fun aumentarStock(cantidad: Int) {
        cantidadDisponible += cantidad
    }
}
