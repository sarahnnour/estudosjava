package test;

import dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("teste");
        funcionario.setAge(12);
        funcionario.setSalary(new double[]{1200, 987.32, 2000});
        funcionario.imprimir();


    }
}
