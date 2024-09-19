import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    Usuario(String nome) {
        this.nome = nome;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
