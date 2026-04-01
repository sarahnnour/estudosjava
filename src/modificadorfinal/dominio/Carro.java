package modificadorfinal.dominio;

public class Carro {
    private String nome;
    private static final double VELOCIDADE_LIMITE = 250;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
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
