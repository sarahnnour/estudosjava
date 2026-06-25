package exercicioRelascionamento.exercicio6;

import java.util.Objects;

/**
 Altere a classe Funcionario para ao invés de utilizar uma String para representar a data, crie uma
 outra classe, chamada Data, que possui 3 campos int, para dia, mês e ano. Faça com que seu
 funcionário passe a usá-la.
 Um esboço da classe:
 class Funcionario {
 Prof. Marcio Bigolin – marcio.bigolin@canoas.ifrs.edu.br
 Programação Orientada a Objetos
 Data dataDeEntrada; // qual é o valor default aqui?
 // seus outros atributos e métodos
 }
 Modifique o método testaFuncionario() da classe FuncionarioTest para que você crie uma
 Data e atribua ela ao Funcionario.
 Funcionario f1 = new Funcionario();
 //...
 Data data = new Data(); // ligação!
 f1.dataDeEntrada = data;
 //continua os testes


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
}
