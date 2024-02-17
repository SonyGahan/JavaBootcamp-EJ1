import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    //Constructores:
    // 1 - Constructor por defecto
    public Cuenta() {
        this.numeroCuenta = 0;
        this.dniCliente = 0;
        this.saldoActual = 0.0;
    }

    // 2 - Constructor con DNI, saldo, número de cuenta e interés.
    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }


    //Getters and Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta: ");
        this.numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        this.dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        this.saldoActual = scanner.nextDouble();
    }

    // Método ingresar: el método recibe una cantidad de dinero a ingresar y se la sumará al saldo actual.
    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
    }

    // Método retirar: el método recibe una cantidad de dinero a retirar y se le restará al saldo actual.
    // Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
    public void retirar(double retiro) {
        if (retiro <= this.saldoActual) {
            this.saldoActual -= retiro;
        } else {
            this.saldoActual = 0;
        }
    }

    // Método extraccionRapida: permite sacar solo un 20% de su saldo.
    public void extraccionRapida() {
        double retiro = this.saldoActual * 0.20;
        this.retirar(retiro);
    }

    // Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + this.saldoActual);
    }

    // Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI del cliente: " + this.dniCliente);
        System.out.println("Saldo actual: " + this.saldoActual);
    }


    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        cuenta.ingresar(10000);
        cuenta.consultarSaldo();

        cuenta.retirar(5000);
        cuenta.consultarSaldo();

        cuenta.extraccionRapida();
        cuenta.consultarSaldo();

        cuenta.consultarDatos();
    }
}
