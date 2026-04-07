package enumeracao.test;

import enumeracao.dominio.Cliente;
import enumeracao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("XX", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("XX",TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
