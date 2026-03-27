package blocosdeinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int eps: episodios){
            System.out.print(eps+ " ");
        }
        }

    public int[] getEpisodios() {
        return episodios;
    }
}
