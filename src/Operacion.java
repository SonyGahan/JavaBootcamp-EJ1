import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    //Constructores:
    // 1 - Constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // 2 - Constructor sin los atributos pasados por parámetro
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    //Getters and Setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


    // Método crearOperacion(): pide al usuario los dos números y los guarda en los atributos del objeto.
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        this.numero1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        this.numero2 = scanner.nextDouble();
    }

    // Método sumar(): calcula la suma de los números y devuelve el resultado al main.
    public double sumar() {
        return this.numero1 + this.numero2;
    }

    // Método restar(): calcula la resta de los números y devuelve el resultado al main.
    public double restar() {
        return this.numero1 - this.numero2;
    }

    // Método multiplicar(): primero valida que no se haga una multiplicación por cero,
    // si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    // Si no, se hace la multiplicación y se devuelve el resultado al main.
    public double multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: Multiplicación por cero.");
            return 0;
        }
        return this.numero1 * this.numero2;
    }

    // Método dividir(): primero valida que no se haga una división por cero,
    // si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error.
    // Si no, se hace la división y se devuelve el resultado al main.
    public double dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return this.numero1 / this.numero2;
    }

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());
    }
}