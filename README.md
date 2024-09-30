# Carrito de Compras en Kotlin

## Ejecución

1. Abre el archivo `Main.kt` en IntelliJ IDEA.

2. Asegúrate de que el archivo `productos.json` esté ubicado en la carpeta `resources` dentro de tu proyecto.

3. Compila el proyecto para asegurarte de que no hay errores.

4. Ejecuta el programa:
   - Haz clic derecho en `Main.kt` y selecciona **Run 'MainKt'** (o presiona `Shift + F10`).

5. Interactúa con el programa a través de la consola:
   - Selecciona una opción del menú principal para comenzar a usar el sistema.
   - Sigue las instrucciones en pantalla para agregar productos al carrito, eliminar productos o generar una factura.
   - Puedes salir del programa seleccionando la opción correspondiente en el menú.


## Descripción

Este proyecto es un sistema de carrito de compras desarrollado en Kotlin que permite a los usuarios seleccionar productos, agregarlos al carrito, eliminarlos y generar una factura. Está diseñado para ayudar a los estudiantes a practicar conceptos clave como la programación orientada a objetos, manejo de colecciones y la interacción mediante la consola.

## Características

- **Selección de Productos**: Visualización de productos disponibles con sus atributos.
- **Agregar y Eliminar Productos**: Funcionalidades para manejar los productos en el carrito.
- **Visualización del Carrito**: Muestra dinámicamente los productos seleccionados y el total general.
- **Facturación**: Generación de una factura detallada que incluye impuestos y totales.
- **Interacción por Consola**: Interfaz de usuario amigable a través de la consola.

## Requerimientos

- **Kotlin**: Este proyecto utiliza Kotlin. Asegúrate de tener instalado el SDK de Kotlin en tu entorno de desarrollo.
- **IntelliJ IDEA**: Recomendado para el desarrollo de este proyecto. Asegúrate de tener la configuración de Kotlin adecuada.

## Instalación

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tu_usuario/nombre_del_repositorio.git

```bash
CarritoDeCompras/
│
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   ├── Main.kt                # Punto de entrada principal del proyecto
│   │   │   ├── models/
│   │   │   │   ├── Producto.kt         # Clase que define los atributos de un producto
│   │   │   │   ├── Carrito.kt          # Clase que maneja el carrito de compras
│   │   │   │   ├── Factura.kt          # Clase que representa la factura final
│   │   │   ├── utils/
│   │   │   │   ├── Calculos.kt         # Funciones de cálculo (total, impuestos, etc.)
│   │   │   │   ├── Interfaz.kt         # Funciones para la interacción con el usuario
│   │   │   └── services/
│   │   │       ├── CarritoService.kt   # Lógica principal de manejo del carrito
│   │   │       ├── ProductoService.kt   # Lógica de manejo de productos
│   │   └── resources/
│   │       └── productos.json          # Archivo de datos con la lista de productos
│
└── .gitignore                          # Archivo para ignorar ficheros en Git

