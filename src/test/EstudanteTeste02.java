package test;

import dominio.Estudante;
import dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Sarah";
        estudante01.idade = 17;
        estudante01.sexo = 'F';

        estudante02.nome = "Erick";
        estudante02.idade = 17;
        estudante02.sexo = 'M';

        System.out.println("------------------------");

        impressora.imprime(estudante02);

    }
}
