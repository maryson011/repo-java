public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Calculo calculo = new Soma();

        System.out.println(calculo.executar(3,2));
        calculo = new Multiplicar();
        System.out.println(calculo.executar(3, 2));

        Calculo calc = (a, b) -> {
            return a + b;
        };
        System.out.println(calc.executar(4,4));
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(5,5));
        System.out.println(calc.legal());
        System.out.println(Calculo.finalizado());

    }
}