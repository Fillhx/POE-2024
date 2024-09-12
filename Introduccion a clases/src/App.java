public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String universidad = "Del Valle";
        boolean voyAganarEventos = true;
        Humano humano1 = new Humano();
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



    }
}
