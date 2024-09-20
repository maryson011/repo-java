import java.util.function.UnaryOperator;

public class Utilitarios {
    static public final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    static public final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    static public final String grito(String n) {
      return n + "!!!";
    };
}
