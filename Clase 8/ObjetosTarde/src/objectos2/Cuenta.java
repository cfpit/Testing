package objectos2;

public class Cuenta {
    //atributos
    public int saldo;
    public String moneda;

    //constructor
    public Cuenta(int saldo, String moneda) {
        this.saldo = saldo;
        this.moneda = moneda;
    }

    //métodos
    public void depositar(int cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(int cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta [saldo=" + saldo + ", moneda=" + moneda + "]";
    }

    

    
}
