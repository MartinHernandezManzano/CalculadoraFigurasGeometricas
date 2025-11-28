public abstract class Figura {
    // Cada subclase tiene que definir cómo se calcula el área
    public abstract double calcularArea();

    // Cada subclase tiene que definir cómo se calcula el perímetro
    public abstract double calcularPerimetro();

    // Método común para mostrar área y perímetro en pantalla con formato
    public void mostrarResumen() {
        System.out.printf("Área: %.2f | Perímetro: %.2f\n", calcularArea(), calcularPerimetro());
    }
}
