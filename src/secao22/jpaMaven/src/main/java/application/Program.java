package application;


import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(null, "Carlos Gmail", "Carlos@gmail.com");
        Pessoa pessoa2 = new Pessoa(null, "Debora Gmail", "Deb@gmail.com");
        Pessoa pessoa3 = new Pessoa(null, "Bia Gmail", "Bia@gmail.com");

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            EntityManager em = emf.createEntityManager();

//          É necessário ter uma segurança, utilizando TRANSAÇÕES, para que toda operação seja executada ou se não for não sera alterada
//          Serve par manter a consistencia do banco de dados

            em.getTransaction().begin();
            em.persist(pessoa);
            em.persist(pessoa2);
            em.persist(pessoa3);
            em.getTransaction().commit();

            System.out.println("Pronto!");

            em.close();
            emf.close();

        }catch (RuntimeException e){

        }
    }
}
