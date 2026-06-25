package exercicioRelascionamento.exercicio2;

public class FuncionarioTest {
    static void main() {
        testFuncionario();
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
}
