package exercicioRelascionamento.exercicio6;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return
                dia +
                "/" + mes +
                "/" + ano ;
    }
}
