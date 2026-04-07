package modificadorfinal.test;

import modificadorfinal.dominio.Carro;
import modificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("bmw");
        Comprador comprador = new Comprador("Sarah");

        System.out.println(carro.toString());

    }
}
