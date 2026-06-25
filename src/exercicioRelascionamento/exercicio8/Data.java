package exercicioRelascionamento.exercicio8;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
    }

    /* metodo formata() troquei para o toString()*/
    @Override
    public String toString() {
        return
                dia +
                "/" + mes +
                "/" + ano ;
    }
}
