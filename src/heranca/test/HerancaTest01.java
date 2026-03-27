package heranca.test;

import heranca.domain.Endereco;
import heranca.domain.Funcionario;
import heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
       Endereco endereco = new Endereco();
       endereco.setRua("Rua 3");
       endereco.setCep("93295-431");

       Pessoa pessoa = new Pessoa();
       pessoa.setNome("Sarah");
       pessoa.setCpf("04132132167");
       pessoa.setEndereco(endereco);

       pessoa.imprime();

       Funcionario funcionario = new Funcionario();
       funcionario.setNome("Sarah");
       funcionario.setCpf("1234");
       funcionario.setEndereco(endereco);
       funcionario.setSalario(2000.0);

       funcionario.imprime();
    }
}
