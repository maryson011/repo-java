public class ObjetoVsPrimitivo {
    public static void main(String[] args) {
        String s = "texto";
        System.out.println(s.toUpperCase());
        String d = new String("String D");
        System.out.println(d);

        // Wrappers são a versão objeto dos tipos primitivos
        int a = 1234;
        System.out.println(a);
    }
}
