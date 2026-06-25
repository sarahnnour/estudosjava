package exercicioRelascionamento.exercicio5;

import exercicioRelascionamento.exercicio5.Funcionario;

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
        Funcionario funcionario1 = new Funcionario("Sarah","TI","Porto Alegre", 1000, "28-10-2024", "21344322", true);

        System.out.println("Antes de usar os métodos demite() e bonifica()");
        System.out.println(funcionario1.toString());

        funcionario1.bonifica(300);
        funcionario1.demite();

        System.out.println("Depois de usar os métodos demite() e bonifica()");
        System.out.println(funcionario1.toString());
    }

    public static void testaFuncionariosIguais(){
        Funcionario funcionario1 = new Funcionario("Sarah","TI","Porto Alegre", 1000, "28-10-2024", "21344322", true);
        Funcionario funcionario2 = new Funcionario("Sarah","TI","Porto Alegre", 1000, "28-10-2024", "21344322", true);
        Funcionario funcionario3 = new Funcionario("Luiza","TI","Canoas", 1000, "28-10-2024", "21344322", true);

        funcionario1.igual(funcionario2);
        funcionario1.igual(funcionario3);
    }

    public static void testaFuncionariosComMesmaReferencia(){
        Funcionario funcionario1 = new Funcionario("Luiza","TI","Canoas", 1000, "28-10-2024", "21344322", true);
        Funcionario funcionario2 = funcionario1;

        funcionario1.igual(funcionario2);
    }
}
