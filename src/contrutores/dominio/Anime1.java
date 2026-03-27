package contrutores.dominio;

public class Anime1 {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;
    private String diretor;

    public Anime1(String name, String tipo, int episodios, String genero){
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime1(String name, String tipo, int episodios, String genero, String diretor){
        this(name, tipo, episodios, genero);
        this.diretor = diretor;
    }
    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.diretor);
    }

    public void init(String name, String tipo, int episodios){
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String name, String tipo, int episodios, String genero){
        init(name, tipo, episodios);
        this.genero = genero;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
