// Clase para representar un círculo
public class Circulos implements CalculosFormas{
    private double radio; // Radio del círculo


    //Constructor
    public Circulos(double radio) {
        this.radio = radio;
    }

    // Implementación del método para calcular el área del círculo
    @Override
    // Se indica que un método en una subclase (Circulos) está sobrescribiendo un método de su superclase (CalculosFormas)
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    // Implementación del método para calcular el perímetro del círculo
    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
