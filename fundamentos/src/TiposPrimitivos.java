public class TiposPrimitivos {
    public static void main(String[] args) {
        // byte, short, int, long
        // 1,    2,    4,    8
        // byte -> 128 ate +127
        // double (8 bytes), float (4 bytes)
        // 1 byte = 8 bits
        // boolean = true or false

        // Informações do funcinario
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 345332;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasACumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numeros de viagens
        System.out.println(numeroDeVoos / 2);

        // Ponto acc
        System.out.println(pontosAcumulados / vendasACumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Status " + status);
        System.out.println(estaDeFerias);
    }
}
