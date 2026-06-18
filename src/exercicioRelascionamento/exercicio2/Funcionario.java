package exercicioRelascionamento.exercicio1;
/**
Sarah Nour - implemente uma classe Funcionário que deve ter o nome do funcionário, o departamento onde
trabalha, seu salário (double), a data de entrada no banco (String), seu RG (String) e um valor
booleano que indique se o funcionário está na empresa no momento ou se já foi embora.
Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método
bonifica que aumenta o salário do funcionário de acordo com o parâmetro passado como
argumento. Crie, também, um método demite, que não recebe parâmetro algum, só modifica o
valor booleano indicando que o funcionário não trabalha mais aqui. Identifique que informações
são importantes para o funcionário e o que um funcionário faz.
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

    public void bonifica(double aumento){
        this.salario += aumento;
    }

    public void demite(){
        estaNaEmpresa = false;
    }
}
