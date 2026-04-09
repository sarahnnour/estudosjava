package aulaifcurso.listaexercicio.ex1;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void mensagemErro() {
        throw new IllegalArgumentException("Data inválida 00-00-0000");
    }

    public Data(int dia, int mes, int ano) {
        if (mes > 12 || mes < 1) {
            mensagemErro();
        }
        if (mes == 2 && dia > 28) {
            mensagemErro();
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30) {
            mensagemErro();
        }
        if (dia > 31 || dia < 0) {
            mensagemErro();
            mensagemErro();
        }
        if (ano < 0) {
            mensagemErro();
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void verData() {
        System.out.printf("%02d/%02d/%d%n", dia, mes, ano);
    }
}