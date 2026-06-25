package exercicioRelascionamento.exercicio9e10;

/**
 * Crie uma nova classe chamada Porta com a seguinte especificação:
 * Classe: Porta
 * Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
 * Métodos: void abre()
 *  void fecha()
 *  void pinta(String s)
 *  boolean estaAberta()
 * Em uma classe PortaTest, crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere
 * suas dimensões e use o método estaAberta para verificar se ela está aberta.
 */
public class Porta {
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;
    private boolean aberta;

    public Porta(String cor, int dimensaoX, int dimensaoY, int dimensaoZ, boolean aberta) {
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
        this.aberta = aberta;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "cor='" + cor + '\'' +
                ", dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                ", aberta=" + aberta +
                '}';
    }

    public void abre(){
        aberta = true;
    }

    public void fecha(){
        aberta = false;
    }

    public void pinta(String cor){
        this.cor = cor;
    }

    public boolean estaAberta(){
        return aberta;
    }

}
