package exercicioRelascionamento.exercicio4;

import java.util.Objects;

/**
 SARAH NOUR - Na classe Funcionario, construa um método chamado igual(Funcionario func) que recebe um
 funcionários e retorna um valor booleano indicando se o funcionário recebido é igual ao próprio. Na
 classe de teste, crie um método testaFuncionariosIguais() que cria dois novos funcionários
 (usando new) e atribui as variáveis os mesmos valores. Na classe de teste, execute o método
 iguais(Funcionario func) para compará-los.
 class Funcionario {
 // seus outros atributos e métodos
 boolean iguais(Funcionario func){
 if (this == func) {
 return true;
 } else {
 return false;
 }
 }
 public class FuncionarioTeste {

 public static void main(String[] args) {
 testaFuncionario();
 testaFuncionariosIguais();
 Prof. Marcio Bigolin – marcio.bigolin@canoas.ifrs.edu.br
 Programação Orientada a Objetos
 }
 public void testaFuncionariosIguais(){
 Funcionario f1 = new Funcionario();
 f1.setNome("Pedro");
 f1.setSalario(100);
 Funcionario f2 = new Funcionario();
 f2.setNome("Pedro");
 f2.setSalario(100);
 if (f1.igual(f2)){
 System.out.println("Os funcionários são iguais");
 } else{
 System.out.println("Os funcionários são diferentes");
 }
 }
 }
 Faça as consistências para executar o método sem erro através da invocação f1.igual(null).
 Inclua isso no método de teste.

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
