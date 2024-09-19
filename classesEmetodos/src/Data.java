public class Data {
    int dia;
    int mes;
    int ano;

    public String getData() {
        // return this.dia+"/"+this.mes+"/"+this.ano;
        String formato = "%d/%d/%d";
        return String.format(formato, this.dia, mes, ano);
    }
}
