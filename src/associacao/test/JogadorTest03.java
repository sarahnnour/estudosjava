package associacao.test;

import associacao.dominio.Jogador;
import associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Sarah");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador,jogador2};

        Time time = new Time("Seleção brasileira");

        jogador.setTime(time);

        time.setJogadores(jogadores);

        time.imprime();
    }
}
