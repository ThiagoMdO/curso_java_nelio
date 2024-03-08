package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.management.ManagementFactory;
import java.sql.SQLException;

public class Program02 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        //Inserir no banco de dados
//        Pessoa p1 = new Pessoa(null, "Raimundo", "raimundo@gmail.com");
//        Pessoa pessoa2 = new Pessoa(null, "Debora Gmail", "Deb@gmail.com");
//        Pessoa pessoa3 = new Pessoa(null, "Geremias Gmail", "geremias@gmail.com");
//
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(pessoa2);
//        em.persist(pessoa3);
//        em.getTransaction().commit();

        //Buscar no banco de dados
//        Pessoa p = em.find(Pessoa.class, 10);
//        System.out.println(p);

        //Remover no banco de dados
        Pessoa p1 = em.find(Pessoa.class, 10);

        em.getTransaction().begin();
        em.remove(p1);
        em.getTransaction().commit();


    }
}
