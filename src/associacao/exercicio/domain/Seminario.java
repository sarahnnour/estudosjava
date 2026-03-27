package associacao.exercicio.domain;

public class Seminario {

    private String nome;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Nome do seminario: "+this.nome);

        if(local!=null){
            System.out.println("Local:"+local.getEndereco());
        }

        if(alunos != null){
            System.out.println("---Alunos---");
            for(Aluno aluno: alunos){
                System.out.println("Nome: "+aluno.getNome());
                System.out.println("Idade: "+aluno.getIdade());
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
