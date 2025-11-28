import java.util.Scanner;

public class MainFiguras {
    public static void main(String[] args) {
        // Scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);

        // Array para guardar las figuras creadas
        Figura[] figuras = new Figura[20];

        // Contador de cuántas figuras hay en el array
        int contador = 0;

        // Variable para la opción del menú
        int opcion;

        // Menú principal (se repite hasta que el usuario elige salir con opción 5)
        do {
            System.out.println("\n--- CALCULADORA DE FIGURAS GEOMÉTRICAS ---");
            System.out.println("1. Crear círculo");
            System.out.println("2. Crear rectángulo");
            System.out.println("3. Crear triángulo");
            System.out.println("4. Mostrar figuras creadas");
            System.out.println("5. Salir");
            System.out.println("6. Dibujar figuras");
            System.out.print("Elige una opción: ");

            try {
                // Leo la opción y la convierto a número
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        // Crear círculo
                        System.out.print("Introduce el radio: ");
                        double radio = Double.parseDouble(sc.nextLine());

                        figuras[contador++] = new Circulo(radio);
                        figuras[contador - 1].mostrarResumen();
                        break;

                    case 2:
                        // Crear rectángulo
                        System.out.print("Introduce la base: ");
                        double base = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce la altura: ");
                        double altura = Double.parseDouble(sc.nextLine());

                        figuras[contador++] = new Rectangulo(base, altura);
                        figuras[contador - 1].mostrarResumen();
                        break;

                    case 3:
                        // Crear triángulo
                        System.out.print("Introduce la base: ");
                        double b = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce la altura: ");
                        double h = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce el lado 1: ");
                        double l1 = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce el lado 2: ");
                        double l2 = Double.parseDouble(sc.nextLine());

                        figuras[contador++] = new Triangulo(b, h, l1, l2);
                        figuras[contador - 1].mostrarResumen();
                        break;

                    case 4:
                        // Mostrar todas las figuras creadas
                        System.out.println("\n--- FIGURAS GUARDADAS ---");
                        for (int i = 0; i < contador; i++) {
                            System.out.print((i + 1) + ". ");
                            figuras[i].mostrarResumen();
                        }
                        break;

                    case 5:
                        // Salir del programa
                        System.out.println("Saliendo del programa...");
                        break;

                    case 6:
                        // Dibujar las figuras que implementen Dibujable
                        System.out.println("\n--- DIBUJANDO FIGURAS ---");
                        for (int i = 0; i < contador; i++) {
                            if (figuras[i] instanceof Dibujable) {
                                ((Dibujable) figuras[i]).dibujar();
                            }
                        }
                        break;

                    default:
                        // Opción fuera del rango
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                // Error si se mete texto en vez de número
                System.out.println("Error: Debes introducir un número válido.");
                opcion = 0;
            } catch (IllegalArgumentException e) {
                // Error si se mete un valor negativo o inválido
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }

        } while (opcion != 5);  // El menú sigue hasta que se pulse 5

        // Cierro el Scanner
        sc.close();
    }
}
