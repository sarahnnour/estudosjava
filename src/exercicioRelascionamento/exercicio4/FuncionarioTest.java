package exercicioRelascionamento.exercicio4;

import exercicioRelascionamento.exercicio4.Funcionario;

public class FuncionarioTest {
    static void main() {
        testFuncionario();
        testaFuncionariosIguais();
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
}
