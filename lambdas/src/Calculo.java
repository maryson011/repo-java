@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String finalizado() {
        return "finalizado";
    }

}

