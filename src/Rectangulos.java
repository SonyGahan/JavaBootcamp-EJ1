// Clase para representar un rectángulo
public class Rectangulos implements CalculosFormas {
    private double base;   // Base del rectángulo
    private double altura; // Altura del rectángulo

    // Constructor
    public Rectangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    // Implementación del método para calcular el área del rectángulo
    @Override
    // Se indica que un método en una subclase (Rectangulos) está sobrescribiendo un método de su superclase (CalculosFormas)
    public double calcularArea() {
        return base * altura;
    }

    // Implementación del método para calcular el perímetro del rectángulo
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
