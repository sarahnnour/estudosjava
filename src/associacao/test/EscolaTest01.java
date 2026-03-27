package associacao.test;

import associacao.dominio.Escola;
import associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Sarah");
        Professor professor2 = new Professor("Erick");
        Escola escola = new Escola("IF Canoas");

        Professor[] professores = {professor1,professor2};
        escola.setProfessores(professores);
        escola.imprime();
    }
}
