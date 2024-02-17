public class Main {
    public static void main(String[] args) {
        // Crear un círculo con radio 5
        Circulos circulos = new Circulos(5);
        System.out.println("Área del círculo: " + circulos.calcularArea());
        System.out.println("Perímetro del círculo: " + circulos.calcularPerimetro());

        // Crear un rectángulo con base 4 y altura 3
        Rectangulos rectangulos = new Rectangulos(4, 3);
        System.out.println("Área del rectángulo: " + rectangulos.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulos.calcularPerimetro());
    }
}
