package org.example.modelo;

@FunctionalInterface
public interface MemoriaObservador {
    public void valorAlterado(String novoValor);
}
