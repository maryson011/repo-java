public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição por valor

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data();
        d1.dia = 19;
        d1.mes = 9;
        d1.ano = 2024;
        Data d2 = d1;

        System.out.println(d2.getData());
        voltarDataParaValorPadrao(d1);
        System.out.println(d1.getData());
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
}
