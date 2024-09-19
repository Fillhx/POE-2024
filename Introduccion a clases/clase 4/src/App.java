import animales.Perro;
import enums.Raza;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Perro perro1 = new Perro("2",Raza.Pitbull, "axel");
        System.out.println(perro1.nombre);
        perro1 = null;
        System.gc();
    }
}