


# Calculadora de Figuras Geométricas

## Descripción
Programa en Java que permite crear figuras geométricas (círculo, rectángulo y triángulo), calcular su área y perímetro y dibujarlas en ASCII. Todo se gestiona desde un menú en consola.

## Estructura
- **Figura (abstracta):** define `calcularArea()` y `calcularPerimetro()`.
- **Dibujable (interfaz):** obliga a implementar `dibujar()`.
- **Circulo, Rectangulo, Triangulo:** heredan de `Figura` y usan `Dibujable`.
- **MainFiguras:** clase principal con menú, array de figuras y lógica para crear, mostrar y dibujar.

## Funcionalidades
1. Crear figuras (círculo, rectángulo, triángulo).
2. Mostrar área y perímetro de cada figura.
3. Listar todas las figuras creadas.
4. Dibujar figuras en ASCII.
5. Salir del programa.

## Ejemplo de uso
```
--- CALCULADORA DE FIGURAS GEOMÉTRICAS ---
1. Crear círculo
2. Crear rectángulo
3. Crear triángulo
4. Mostrar figuras creadas
5. Salir
6. Dibujar figuras
Elige una opción: 1
Introduce el radio: 5
Área: 78.54 | Perímetro: 31.42
```

## Detalles técnicos
- Array fijo de 20 posiciones para guardar figuras.
- Encapsulamiento con atributos privados y validación en setters.
- Polimorfismo: todas las figuras se manejan como `Figura[]`.
- Interfaz `Dibujable` para asegurar que cada figura tenga su propio dibujo ASCII.
```

