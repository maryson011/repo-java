import java.util.function.BinaryOperator;

public class TesteBinaryOperation {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(3.0,3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(4.4,6.6));

        BinaryOperator<Integer> calcInt = (x, y) -> x + y;
        System.out.println(calcInt.apply(3,3));
    }
}
