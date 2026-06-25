package exercicioRelascionamento.exercicio7;

import exercicioRelascionamento.exercicio6.Data;

import java.util.Objects;

/**
 Modifique o seu teste para verificar se o nome e o salario são os mesmos: ou seja mesmo com
 referências diferentes o objeto deve retornar que são iguais


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
