package classesabstratas.test;

import classesabstratas.dominio.Desenvolvedor;
import classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Erick", 3000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Sarah", 5000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
