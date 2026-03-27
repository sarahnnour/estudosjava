package sobrecargasmetodos.dominio;

public class Anime {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(){

    }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
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
