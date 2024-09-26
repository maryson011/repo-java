package com.maryson.jpa.teste.basico;

import com.maryson.jpa.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 2L);
        em.detach(usuario);

        usuario.setNome("Marcos");
        em.merge(usuario);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
