package models

class Factura(private val carrito: Carrito, private val tasaImpuesto: Double = 0.0) {

    // Función para generar y mostrar la factura en la consola
    fun generarFactura() {
        println("----------- Factura -----------")
        carrito.mostrarCarrito()  // Muestra los productos en el carrito
        val subtotal = carrito.calcularTotal()
        val impuestos = subtotal * tasaImpuesto
        val totalFinal = subtotal + impuestos

        // Detalles de la factura
        println("Subtotal: $subtotal")
        if (tasaImpuesto > 0.0) {
            println("Impuestos (${tasaImpuesto * 100}%): $impuestos")
        }
        println("Total a pagar: $totalFinal")
        println("------------------------------")
    }
}
