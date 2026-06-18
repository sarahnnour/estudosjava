package exercicioRelascionamento.exercicio3;
/**
 Crie um método mostra() que não recebe nem devolve parâmetro algum, simplesmente imprime a
 especificação e o valor de todos os atributos do nosso funcionário. Dessa maneira, você não
 precisa ficar copiando e colando um monte de System.out.println() para verificar o estado do
 objeto a cada mudança.
 class Funcionario {
 // seus outros atributos e métodos
 Prof. Marcio Bigolin – marcio.bigolin@canoas.ifrs.edu.br
 Programação Orientada a Objetos
 void mostra() {
 System.out.println("Nome: " + this.nome);
 // imprimir aqui os outros atributos...
 // também pode imprimir this.calculaGanhoAnual()
 }
 }
 Mais tarde veremos o método toString, que é uma solução muito mais elegante para mostrar a
 representação de um objeto como String, além de não jogar tudo pro System.out (só se você
 desejar).
 Na classe de teste, faça o método testaFuncionario() executar o recém criado mostra()após
 criar o usuário e bonificá-lo.
 Funcionario meuFuncionario = new Funcionario();
 //código existente
 meuFuncionario.mostra();
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
}
