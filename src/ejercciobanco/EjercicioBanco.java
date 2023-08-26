
package ejercciobanco;

public class EjercicioBanco {
    String nombre;
    String apellido;
    int saldo;

    public EjercicioBanco(String nombre, String apellido, int saldo) { 
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }

    public void debitar(int debito) {
        if (debito <= saldo) {
            saldo -= debito;
            System.out.println("Debito realizado. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el débito.");
        }
    }

    public void abonar(int abono) {
        saldo += abono;
        System.out.println("Abono realizado. Saldo actual: " + saldo);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Saldo: " + saldo);
    }
}
