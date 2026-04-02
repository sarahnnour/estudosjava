package aulaifcurso.exerciciolampada.domain;

public class Lampada {

    private boolean ligada;
    private int watts;

    public Lampada() {
        this.watts = 60;
        this.ligada = false;
    }

    public Lampada(boolean ligada, int watts) {
        this.watts = watts;
        this.ligada = ligada;
    }

    public void interruptor(boolean ligada){
        this.ligada = ligada;
    }

    public void mostrarEstadoLampada(){
        String estadoLampada = (ligada) ? "Ligada":"Desligada";
        System.out.println("A lâmpada está: "+estadoLampada);
        System.out.println("Potencia da lâmpada: "+watts);
    }
}
