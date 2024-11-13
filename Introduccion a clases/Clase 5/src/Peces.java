public class Peces {
    public final boolean respiraBajoelAgua = true;
    private String formaNadar;
    private short numerodeHuevos;
    public Peces(String formaNadar, short numerodeHuevos) {
        this.formaNadar = formaNadar;
        this.numerodeHuevos = numerodeHuevos;
    }
    public String getFormaNadar() {
        return formaNadar;
    }
    public void setFormaNadar(String formaNadar) {
        this.formaNadar = formaNadar;
    }
    public short getNumerodeHuevos() {
        return numerodeHuevos;
    }
    public void setNumerodeHuevos(short numerodeHuevos) {
        this.numerodeHuevos = numerodeHuevos;
    }
    
}
