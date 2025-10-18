package objectos2;

public class Test {
    public static void main(String[] args) {
        //crear objeto cuenta
        Cuenta cuenta1 = new Cuenta(1000, "USD");

        //comportamiento
        cuenta1.depositar(500);
        cuenta1.retirar(200);

        //mostrar estado
        System.out.println(cuenta1);
    }
}
