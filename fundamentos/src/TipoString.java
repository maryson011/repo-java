public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Bom dia";
        System.out.println(s.concat("!!!!"));
        System.out.println(s + "!!!!");
        System.out.println(s.startsWith("B"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase().endsWith("A"));
        System.out.println(s.equals("bom dia"));
        System.out.println(s.equalsIgnoreCase("bom dia"));
        String nome = "maryson";
        String sobrenome = "silva";
        int idade = 31;
        System.out.printf("Nome: %s %s %d ", nome, sobrenome, idade);
        String frase = String.format("\n - %s %s %d ", nome, sobrenome, idade);
        System.out.println(frase);
        System.out.println(frase.contains("31"));
        if (frase.contains("32")) {
            System.out.println("Você já deve ser um pai de familia, não é mesmo?");
        } else {
            String[] partes = frase.split(" ");
            System.out.println(partes[4]);
        }


    }
}
