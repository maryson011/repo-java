public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom dia X";
        s = s.toUpperCase();
        System.out.println(s);
        s = s.replace("X", "Senhora");
        System.out.println(s);
        s = s.concat("!!!");
        System.out.println(s);
        System.out.println(s.toLowerCase());
        String f = "Olá X"
                .replace("X", "Ju")
                .toUpperCase()
                .concat(". Tudo bem?");

        System.out.println(f);

        // Tipos primitivos não tem notação ponto

    }
}
