package exercicioRelascionamento.exercicio7;

import exercicioRelascionamento.exercicio6.Data;
import exercicioRelascionamento.exercicio7.Funcionario;

public class FuncionarioTest {
    static void main() {
        System.out.println("---Método testFuncionario()");
        testFuncionario();

        System.out.println("---Método testaFuncionariosIguais()");
        testaFuncionariosIguais();

        System.out.println("---Método testaFuncionariosComMesmaReferencia()");
        testaFuncionariosComMesmaReferencia();
    }

    public static void testFuncionario(){
        exercicioRelascionamento.exercicio6.Data dataEntrada = new exercicioRelascionamento.exercicio6.Data(01,3,2000);
        Funcionario funcionario1 = new Funcionario("Sarah","TI","Porto Alegre", 1000, dataEntrada, "21344322", true);

        System.out.println("Antes de usar os métodos demite() e bonifica()");
        System.out.println(funcionario1.toString());

        funcionario1.bonifica(300);
        funcionario1.demite();

        System.out.println("Depois de usar os métodos demite() e bonifica()");
        System.out.println(funcionario1.toString());
    }

    public static void testaFuncionariosIguais(){
        exercicioRelascionamento.exercicio6.Data dataEntrada = new exercicioRelascionamento.exercicio6.Data(01,3,2000);
        Funcionario funcionario1 = new Funcionario("Sarah","TI","Porto Alegre", 1000, dataEntrada, "21344322", true);
        Funcionario funcionario2 = new Funcionario("Sarah","TI","Porto Alegre", 1000, dataEntrada, "21344322", true);
        Funcionario funcionario3 = new Funcionario("Sarah","TI","Canoas", 1000, dataEntrada, "21344322", true);

        funcionario1.igual(funcionario2);
        funcionario1.igual(funcionario3);
        funcionario1.igualNomeESalario(funcionario3);
    }

    public static void testaFuncionariosComMesmaReferencia(){
        exercicioRelascionamento.exercicio6.Data dataEntrada = new Data(01,3,2000);
        Funcionario funcionario1 = new Funcionario("Luiza","TI","Canoas", 1000, dataEntrada, "21344322", true);
        Funcionario funcionario2 = funcionario1;

        funcionario1.igual(funcionario2);
    }
}
