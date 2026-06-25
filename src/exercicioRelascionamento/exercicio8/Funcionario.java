package exercicioRelascionamento.exercicio8;

import exercicioRelascionamento.exercicio6.Data;

import java.util.Objects;

/**
 Modifique seu método mostra() para que ele imprima o valor da dataDeEntrada daquele
 funcionário. Para isso, na classe Data, crie um método chamado formatada() que imprime a data
 formatada como uma String “dd/mm/aaaa”.
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private String localTrabalho;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String departamento, String localTrabalho, double salario, Data dataEntrada, String rg, boolean estaNaEmpresa) {
        this.nome = nome;
        this.departamento = departamento;
        this.localTrabalho = localTrabalho;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaNaEmpresa = estaNaEmpresa;
    }

    /* Já utilize o toString então não criei o mostra()*/
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", localTrabalho='" + localTrabalho + '\'' +
                ", salario=" + salario +
                ", dataEntrada='" + dataEntrada.toString() + '\'' +
                ", rg='" + rg + '\'' +
                ", estaNaEmpresa=" + estaNaEmpresa +
                '}';
    }

    public void bonifica(double aumento){
        this.salario += aumento;
    }

    public void demite(){
        estaNaEmpresa = false;
    }

    public void igual(Funcionario funcionario){
        if(Objects.equals(funcionario.toString(), toString())){
            System.out.println("É igual");
            return;
        }
        System.out.println("É diferente");
    }

    public void igualNomeESalario(Funcionario funcionario){
        if(Objects.equals(funcionario.getNome(), getNome())){
            if(Objects.equals(funcionario.getSalario(), getSalario())){
                System.out.println("É igual");
                return;
            }
        }
        System.out.println("É diferente");
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
