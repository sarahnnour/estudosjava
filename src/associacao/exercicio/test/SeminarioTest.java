package associacao.exercicio.test;

import associacao.exercicio.domain.Aluno;
import associacao.exercicio.domain.Local;
import associacao.exercicio.domain.Professor;
import associacao.exercicio.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {

        Seminario seminario1 = new Seminario("Matematica");
        Seminario[] seminarios = {seminario1};

        Aluno aluno1 = new Aluno("sarah", 17);
        Aluno aluno2 = new Aluno("erick", 17);
        Aluno[] alunos = {aluno1,aluno2};

        Professor professor = new Professor("Claudia","Exatas");

        Local local = new Local("IFRS Canoas");

        seminario1.setAlunos(alunos);
        seminario1.setLocal(local);

        professor.setSeminarios(seminarios);

        seminario1.imprimir();

    }
}
