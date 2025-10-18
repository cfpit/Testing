package objetos;

public class Test {
    public static void main(String[] args) throws Exception {
        //creo dos objetos de la clase Auto

        //objeto 1 usando constructor vacio
        Auto auto1 = new Auto(); 

        //objeto 2 usando constructor con parametros
        Auto auto2 = new Auto("Toyota Etios", 100); 

        //le doy un estado inicial al auto1
        auto1.marca = "Ford Fiesta";

        //comportamiento del auto1
        auto1.acelerar(50); 
        auto1.frenar(20);

        //muestro info de ambos autos
        System.out.println("Informacion del Auto 1:");
        auto1.mostrarInfo();

        System.out.println("Informacion del Auto 2:");
        auto2.mostrarInfo();

    }
}
