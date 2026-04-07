package modificadorfinal.dominio;

public class Carro {
    private String nome;
    private static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador("Dentro do carro");



    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                "comprador='" + COMPRADOR + '\'' +
                '}';
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
