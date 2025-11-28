// La clase Triangulo extiende Figura y también usa la interfaz Dibujable
public class Triangulo extends Figura implements Dibujable {
    // Atributos privados (encapsulamiento)
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    // Constructor que recibe los 4 valores y los valida con setters
    public Triangulo(double base, double altura, double lado1, double lado2) {
        setBase(base);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }

    // Setter de base con validación
    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("La base debe ser mayor que 0");
        this.base = base;
    }

    // Setter de altura con validación
    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        this.altura = altura;
    }

    // Setter del primer lado con validación
    public void setLado1(double lado1) {
        if (lado1 <= 0)
            throw new IllegalArgumentException("El lado 1 debe ser mayor que 0");
        this.lado1 = lado1;
    }

    // Setter del segundo lado con validación
    public void setLado2(double lado2) {
        if (lado2 <= 0)
            throw new IllegalArgumentException("El lado 2 debe ser mayor que 0");
        this.lado2 = lado2;
    }

    // Cada subclase de Figura tiene que implementar calcularArea()
    @Override
    public double calcularArea() {
        // Fórmula: base × altura / 2
        return (base * altura) / 2;
    }

    // Cada subclase de Figura tiene que implementar calcularPerimetro()
    @Override
    public double calcularPerimetro() {
        // Se suman los tres lados
        return base + lado1 + lado2;
    }

    // Método de Dibujable: representación simple del triángulo
    @Override
    public void dibujar() {
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /____\\ ");
    }
}
