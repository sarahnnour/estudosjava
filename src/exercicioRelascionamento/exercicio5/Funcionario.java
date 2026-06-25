package exercicioRelascionamento.exercicio5;

import java.util.Objects;

/**
 Na classe de teste, crie outro método chamado testaFuncionariosComMesmaReferencia() que
 utiliza referências para o mesmo funcionário e compare-os com o método igual(). Imprima os
 resultados de forma semelhante ao método testaFuncionariosIguais(). Para criar duas
 referências para o mesmo funcionário, utilize:
 Funcionario f1 = new Funcionario():
 f1.nome = "Paulo";
 f1.salario = 100;
 Funcionario f2 = f1;

 */
public class Funcionario {
    private String nome;
    private String departamento;
    private String localTrabalho;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String departamento, String localTrabalho, double salario, String dataEntrada, String rg, boolean estaNaEmpresa) {
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
                ", dataEntrada='" + dataEntrada + '\'' +
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
}
