package main;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim....");
    }

    static void geraErro1() {
       throw new RuntimeException("Erro 1");
    }
    static void geraErro2() throws Exception{
        throw new Exception("Erro 2");
    }
}
