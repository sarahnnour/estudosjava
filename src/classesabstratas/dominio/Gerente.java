package classesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void calculaBonus(){
        this.salario = salario + salario * 0.2;
    }

    @Override
    public void imprime(){
        System.out.println("teste");
    }
}
