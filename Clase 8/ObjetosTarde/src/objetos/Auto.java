package objetos;

public class Auto {
    // atributos
    public String marca;
    public int velocidad;

    // metodos constructores
    //constructor por defecto o vacio
    public Auto() {}

    //constructor con parametros o sobrecargado
    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    //metodos de la clase
    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca + ", Velocidad: " + this.velocidad + " km/h");
    }

}
