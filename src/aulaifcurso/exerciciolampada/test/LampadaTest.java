package aulaifcurso.exerciciolampada.test;

import aulaifcurso.exerciciolampada.domain.Lampada;

public class LampadaTest {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada(true,75);

        lampada1.interruptor(false);
        lampada1.mostrarEstadoLampada();
    }
}
