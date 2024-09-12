public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String universidad = "Del Valle";
        boolean voyAganarEventos = true;
        Humano humano1 = new Humano();
        Gato gato1 = new Gato((byte)6, Genero.HEMBRA, "arena",(byte)1, true);
        gato1.setGenero(Genero.MACHO);
        gato1.setNumeroVida((byte)5);
        humano1.setNombre("Adolfo");
        humano1.setEdad((byte)18);
        Humano humano2 = new Humano("Gustavo", (byte)20, "1114339186");
        System.out.println("hola");
        System.out.println(humano2);
        System.out.println(humano2.getNombre());
        System.out.println(humano1.getNombre());
        System.out.println(humano1.getEdad());
        humano1.saludar();
        humano2.saludar();
        humano1.presentarse();
        humano2.presentarse();
        String estratoAdolfo = humano1.estrato(2000000);
        System.out.println(estratoAdolfo);
        System.out.println(gato1);
        String arreglo [] = {"ola", "la", "a"};
        for (String palabra : arreglo){
            System.out.println(palabra);
        }
        Gato gatoA = new Gato((byte)5, Genero.MACHO, "arena",(byte)1, true);
        Gato gatoB = new Gato((byte)3, Genero.HEMBRA, "papel",(byte)4, false);
        Gato gatoC = new Gato((byte)2, Genero.HEMBRA, "plastico",(byte)6, true);
        Perro perrito = new Perro("pepe", Raza.Golden);
        Object arreglo2 [] = {gatoA,gatoB,gatoC,perrito};
        for (Object objeto : arreglo2){
            if(objeto.getClass()==Gato.class){
                Gato gato =(Gato) objeto;
            if(gato.getNumeroVida()<=3){
                System.out.println(objeto);
            }
        }

    }

    }
}
