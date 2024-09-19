import javax.swing.*;

public class ConversaoTiposPrimitivos {
    public static void main(String[] args) {
        double a = 1; // conversão implícita
        System.out.println(a);
        float b = (float) 1.0; // conversão explícita (cast)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro npumeiro");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo npumeiro");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + (soma /  2));

    }
}
