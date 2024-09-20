package personalizadaA;
@SuppressWarnings("serial") // objeto para string
public class NumeroNegaticoException extends RuntimeException {
    private String nomeDoAtributo;
    public NumeroNegaticoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está negativo", nomeDoAtributo);
    }

}
