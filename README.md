# Refactorización con Patrones de Diseño Juego Taller A
Este proyecto es una versión mejorada del siguiente [repositorio](https://github.com/CesarAVegaF312/DYAS-GoF-CreationalPatterns-GameRefactoring), donde se ha aplicado una reestructuración del código utilizando Patrones de Diseño Creacionales (Abstract Factory) para permitir diferentes estilos visuales _(Sprites, vectorial, vectorial con colores)_ sin duplicar lógica de programación.

# Instrucciones para correr el proyecto
Para ejecutar este juego en tu computadora, sigue estos pasos:

Clonar o descargar el repositorio: Asegúrate de tener todos los archivos en una carpeta local.

Asegurate de tener maven instalado y asignado a las variables de entorno de tu computador.

Abrir con un IDE: Importa el proyecto en IntelliJ IDEA, Eclipse o NetBeans como un Proyecto Maven existente y ejecutar:

```
mvn compile
mvn exec:java '-Dexec.mainClass=com.balitechy.spacewar.main.Game'
```
# Cambiar visibilidad del juego
Dirijase al archivo `src/main/java/com/balitechy/spacewar/main/Game.java` y ubiquese en la linea 62, 
vera algo como:
```java
factory = new SpriteFactory();
```
cambie SpriteFactory() por alguna de las opciones que le muestre su IDE y vuelva a ejecutar en la terminal:
```
mvn compile
mvn exec:java '-Dexec.mainClass=com.balitechy.spacewar.main.Game'
```

### SpriteFactory
<img width="792" height="586" alt="image" src="https://github.com/user-attachments/assets/ae813dec-68c8-4733-a1b2-fbcd29b440b8" />

### VectorialStyleFactory
<img width="796" height="581" alt="image" src="https://github.com/user-attachments/assets/ab88fe1f-1c2b-44be-ae50-8d7689e90c57" />

### ColorfulVectorialStyle
<img width="797" height="580" alt="image" src="https://github.com/user-attachments/assets/46c5e3e8-0dc1-4903-a8e7-68d0c1d3e2d2" />


# Patrones de Diseño Implementados
En esta entrega se aplicaron los siguientes patrones para mejorar la arquitectura:

Abstract Factory (Fábrica Abstracta): Se creó una interfaz GameFactory que centraliza la creación de todos los elementos visuales del juego (Jugador, Balas y Fondo). Esto permite cambiar entre el modo "Sprites" y el modo "Canvas" modificando una sola línea de código en la clase Game.

Factory Method (Método de Fábrica): Utilizado en la jerarquía de los jugadores para que cada tipo de jugador sepa qué tipo de proyectil disparar a través de la fábrica.

Herencia y Clases Abstractas: Se implementaron clases como AbstractPlayer, AbstractBullet y AbstractBackgroundRenderer para reutilizar toda la lógica matemática (movimiento y colisiones) y dejar el renderizado como una responsabilidad de las clases hijas.
