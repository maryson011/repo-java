package org.example;

import java.util.Objects;

public class Par<C, V> {
    private C chave;
    private V valor;

    public Par() {

    }

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) obj;
        return Objects.equals(chave, par.chave);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chave == null) ? 0 : chave.hashCode());
        return result;
    }
}
