public class Perro {
    private String nombre;
    private Raza raza;
    
    public Perro(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
        
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    
}
