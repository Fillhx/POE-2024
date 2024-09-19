package animales;

import enums.Raza;

public class Perro {
    String pedigree;
    public Raza raza;
    public String nombre;

    public Perro(String pedigree, Raza raza, String nombre) {
        this.pedigree = pedigree;
        this.raza = raza;
        this.nombre = nombre;
    }
    public void finalize(){

        System.out.println("El perro se borro");
        }
    }
