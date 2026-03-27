package sobrecargasmetodos.test;
import sobrecargasmetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Trocou","AA",13,"Romance");

        anime.imprime();
    }
}
