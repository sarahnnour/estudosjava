package exercicioRelascionamento.exercicio9e10;

/**
 * Crie uma nova classe chamada Casa com a seguinte especificação:
 * Classe: Casa Atributos: cor, porta1, porta2, porta3
 * Método: void pinta(String s),
 *  int quantasPortasEstaoAbertas()
 * Crie uma classe chamada CasaTest que cria uma casa e pinte-a. Crie três portas e coloque-as na
 * casa; abra e feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para
 * imprimir o número de portas abertas.
 */
public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(String cor, Porta porta1, Porta porta2, Porta porta3, boolean aberta) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public void pinta(String cor){
        this.cor = cor;
    }

}
