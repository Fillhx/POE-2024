package animales.mamiferos;
public class Canino {
    private boolean persigueCola = true;
    private String formadeandar;
    private float temperatura;
    public void aullar(){
        System.out.println("Woffff");
        }
    public Canino(String formadeandar, float temperatura) {
        this.formadeandar = formadeandar;
        this.temperatura = temperatura;
    }
}