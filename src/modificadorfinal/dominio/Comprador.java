package modificadorfinal.dominio;

public class Comprador {

    private String name;

    public Comprador(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Comprador{ "+ this.name +"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
