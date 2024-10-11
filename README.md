# conversor-de-monedas

Este proyecto es un conversor de divisas basado en tasas de cambio actuales, utilizando una API de tipo de cambio. Permite convertir varias monedas populares como el dólar estadounidense, el peso argentino, el real brasileño y el peso colombiano. El usuario puede ingresar un monto en una moneda y obtener su equivalente en otra.

## Funcionalidades

- Conversión de dólar a peso argentino, real brasileño y peso colombiano.
- Conversión de las monedas mencionadas hacia dólar.
- Menú interactivo que permite al usuario elegir la conversión deseada.
- Consultas en tiempo real a una API para obtener las tasas de conversión actualizadas.

## Estructura del Proyecto

- `Menu.java`: Proporciona una interfaz de menú para el usuario, permitiendo la selección de opciones de conversión y captura de datos de entrada.
- `Conversor.java`: Se encarga de realizar las conversiones utilizando las tasas obtenidas de la API.
- `Consultas.java`: Clase que realiza las consultas HTTP a la API para obtener las tasas de cambio actuales.
- `Principal.java`: Clase principal en la cual se inicializa y se llama al menu.
- 
## Uso

1. Al ejecutar el programa, aparecerá un menú con las siguientes opciones:
    - 1: Dólar a peso argentino
    - 2: Peso argentino a dólar
    - 3: Dólar a real brasileño
    - 4: Real brasileño a dólar
    - 5: Dólar a peso colombiano
    - 6: Peso colombiano a dólar
    - 7: Salir

2. Selecciona la opción de conversión deseada e ingresa el valor que quieres convertir.

3. El programa te mostrará el resultado de la conversión basado en la tasa de cambio actual.

## Requisitos

- Java 11 o superior.
- Biblioteca `Gson` para manejar el formato JSON.
- Conexión a Internet para realizar las consultas a la API.

## Instalación

1. Clona este repositorio:

    ```bash
    git clone https://github.com/MoisesMGuillen/conversor-de-monedas.git
    ```

2. Compila y ejecuta el proyecto en tu entorno de desarrollo preferido.

3. Asegúrate de tener la biblioteca Gson en el classpath de tu proyecto.

## API utilizada

Este proyecto utiliza [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio.

## Ejemplo

Si eliges la opción "Dólar a peso argentino" y el valor ingresado es `10 USD`, el resultado será: 9762.5 pesos argentinos
