import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // int
        Long l = 100000L; // long
        System.out.println(b.byteValue());
        System.out.println(s.toString());

        Integer is = Integer.parseInt("10000");

        Scanner entrada = new Scanner(System.in);

        Integer n = Integer.parseInt(entrada.next());
        System.out.println(n);
        entrada.close();

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#';
        System.out.println(c.toString() + "...");

        Float f = 123.1F;
        System.out.println(f);

        Double dou = 1234.1234;
        System.out.println(dou);
    }
}
