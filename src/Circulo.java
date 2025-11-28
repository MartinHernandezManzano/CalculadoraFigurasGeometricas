// La clase Circulo extiende Figura y también usa la interfaz Dibujable
public class Circulo extends Figura implements Dibujable {
    // Atributo privado para el radio
    private double radio;

    // Constructor que recibe el radio y lo valida con el setter
    public Circulo(double radio) {
        setRadio(radio);
    }

    // Getter del radio
    public double getRadio() {
        return radio;
    }

    // Setter que valida que el radio sea mayor que 0
    public void setRadio(double radio) {
        if (radio <= 0)
            throw new IllegalArgumentException("El radio debe ser mayor que 0");
        this.radio = radio;
    }

    // Cada subclase de Figura tiene que implementar calcularArea()
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula: π × radio²
    }

    // Cada subclase de Figura tiene que implementar calcularPerimetro()
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Fórmula: 2 × π × radio
    }

    // Método de Dibujable: representación simple del círculo
    @Override
    public void dibujar() {
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
    }
}
