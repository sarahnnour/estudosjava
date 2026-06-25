package exercicioRelascionamento.exercicio9e10;

public class PortaTest {
    static void main() {
        Porta porta1 = new Porta("vermelha", 2,3,4,false);

        porta1.abre();
        porta1.fecha();
        porta1.pinta("azul");
        porta1.setDimensaoX(3);
        porta1.setDimensaoY(3);
        porta1.setDimensaoZ(3);

        System.out.println(porta1.toString());
    }
}
