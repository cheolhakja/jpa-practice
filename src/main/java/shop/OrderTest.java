package shop;

import shop.domain.Item;
import shop.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OrderTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Member member1 = new Member();
        member1.setName("Emily");
        em.persist(member1);

        Item item1 = new Item();
        item1.setName("Cruella");
        em.persist(item1);

        Item item2 = new Item();
        item2.setName("The Amazing Spider-Man");
        em.persist(item2);

        tx.commit();

        em.close();

        emf.close();
    }
}
