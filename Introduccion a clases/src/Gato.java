public class Gato {

    private byte numeroVida = 7;
    private Genero genero;
    Arenero arenero;
    JugueteGatuno juguete;

    

    public Gato(byte numeroVida, Genero genero, String material, byte tamaño, boolean tieneDrogas) {
        this.numeroVida = numeroVida;
        this.genero = genero;
        this.arenero = new Arenero(material);
        this.juguete = new JugueteGatuno(tamaño, tieneDrogas);
    }



    @Override
    public String toString() {
        return "Gato [numeroVida=" + numeroVida + ", genero=" + genero + ", arenero=" + arenero + ", juguete=" + juguete
                + "]";
    }
    

    private class Arenero {
        String material;
        
        @Override
        public String toString() {
            return "Arenero [material=" + material + "]";
        }

        public Arenero(String material){
            this.material=material;
        }
    }
    private class JugueteGatuno {
        byte tamaño;
        boolean tieneDrogas;
        
        @Override
        public String toString() {
            return "JugueteGatuno [tamaño=" + tamaño + ", tieneDrogas=" + tieneDrogas + "]";
        }

        public JugueteGatuno(byte tamaño, boolean tieneDrogas){
            this.tamaño = tamaño;
            this.tieneDrogas = tieneDrogas;
        }
    }
    
    
    public Arenero getArenero() {
        return arenero;
    }


    public void setArenero(Arenero arenero) {
        this.arenero = arenero;
    }


    public JugueteGatuno getJuguete() {
        return juguete;
    }


    public void setJuguete(JugueteGatuno juguete) {
        this.juguete = juguete;
    }


    public byte getNumeroVida() {
        return numeroVida;
    }

    public void setNumeroVida(byte numeroVida) {
        this.numeroVida = numeroVida;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    

}
