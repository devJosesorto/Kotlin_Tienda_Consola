package utils

object Calculos {

    // Función para calcular el total con impuestos
    fun calcularTotalConImpuestos(subtotal: Double, tasaImpuesto: Double): Double {
        val impuestos = subtotal * tasaImpuesto
        return subtotal + impuestos
    }

    // Función para calcular solo los impuestos
    fun calcularImpuestos(subtotal: Double, tasaImpuesto: Double): Double {
        return subtotal * tasaImpuesto
    }

    // Función para redondear valores a 2 decimales (útil para mostrar precios)
    fun redondear(valor: Double): Double {
        return "%.2f".format(valor).toDouble()
    }

    // Función para aplicar un descuento al total (opcional)
    fun aplicarDescuento(total: Double, descuento: Double): Double {
        return total - (total * descuento)
    }
}
