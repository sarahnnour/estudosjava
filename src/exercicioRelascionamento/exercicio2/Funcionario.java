package exercicioRelascionamento.exercicio2;
/**
Sarah Nour - Crie uma classe para testar a classe Funcionario chamada FuncionarioTeste. Esta nova classe
 deve conter o método main.
 Um esboço da classe que possui o FuncionarioTeste:
 public class FuncionarioTeste {

 public static void main(String[] args) {
 testaFuncionario();
 }
 public void testaFuncionario(){
 Funcionario meuFuncionario = new Funcionario();
 //Atribua valores ao funcionário, passando o salario = 1000
 //Execute o método bonifica passando o valor 100
 //Imprima o salario atual
 }
 }
 Incremente essa classe. Faça outros testes, imprima outros atributos e invoque os métodos que
 você criou a mais. Teste valores inválidos. Lembre-se de seguir a convenção java, isso é
 importantíssimo. Isto é, nomeDeAtributo, nomeDeMetodo, nomeDeVariavel, NomeDeClasse, etc...
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
}
