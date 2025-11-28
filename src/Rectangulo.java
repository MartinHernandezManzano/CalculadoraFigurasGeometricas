// La clase Rectangulo extiende Figura y también usa la interfaz Dibujable
public class Rectangulo extends Figura implements Dibujable {
    // Atributos privados: base y altura
    private double base;
    private double altura;

    // Constructor que recibe base y altura y los valida con setters
    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // Getter de la base
    public double getBase() {
        return base;
    }

    // Setter de la base con validación
    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("La base debe ser mayor que 0");
        this.base = base;
    }

    // Getter de la altura
    public double getAltura() {
        return altura;
    }

    // Setter de la altura con validación
    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        this.altura = altura;
    }

    // Cada subclase de Figura tiene que implementar calcularArea()
    @Override
    public double calcularArea() {
        return base * altura; // Fórmula: base × altura
    }

    // Cada subclase de Figura tiene que implementar calcularPerimetro()
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura); // Fórmula: 2 × (base + altura)
    }

    // Método de Dibujable: representación simple del rectángulo
    @Override
    public void dibujar() {
        System.out.println("***********");
        System.out.println("*         *");
        System.out.println("***********");
    }
}
