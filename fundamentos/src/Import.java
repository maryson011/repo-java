import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Import {
    public static void main(String[] args) {
        String s = "Bom dia";
        System.out.println(s);
        Date d = new Date();
        System.out.println(d);
        // JButton botao = new JButton();
        // System.out.println(botao);
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataAtual.format(formato);
        System.out.println(dataFormatada);

    }
}
