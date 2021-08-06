package shop;

import shop.domain.OrderItem;
import shop.domain.Orders;
import shop.domain.item.Book;
import shop.domain.Member;
import shop.domain.item.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OrderTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Member member1 = new Member();
        member1.setName("Emma Stone");
        em.persist(member1);

        Movie movie_cruella = new Movie();
        movie_cruella.setTitle("Cruella");
        em.persist(movie_cruella);

        Movie movie_the_amazing_spider_man_2 = new Movie();
        movie_the_amazing_spider_man_2.setTitle("The Amazing Spider-Man2");
        em.persist(movie_the_amazing_spider_man_2);

        Movie movie_the_amazing_spider_man = new Movie();
        movie_the_amazing_spider_man.setTitle("The Amazing Spider-Man");
        em.persist(movie_the_amazing_spider_man);

        Book book_norwegian_wood = new Book();
        book_norwegian_wood.setAuthor("Haruki");
        book_norwegian_wood.setTitle("Norwegian Wood");
        em.persist(book_norwegian_wood);

        Book book_1Q84 = new Book();
        book_1Q84.setAuthor("Haruki");
        book_1Q84.setTitle("1Q84");
        em.persist(book_1Q84);

        /*엠마 스톤이 1Q84와 크루엘라 그리고 어메이징 스파이더맨을 각각 한개씩 주문하려고한다

         */
        //List<OrderItem> orderItems = new ArrayList<>();
        Orders order_by_Emma_Stone = new Orders();
        order_by_Emma_Stone.setMember(member1);
        em.persist(order_by_Emma_Stone);

        OrderItem orderItem1 = new OrderItem(); //quantity item order
        OrderItem orderItem2 = new OrderItem();
        OrderItem orderItem3 = new OrderItem();
        orderItem1.setQuantity(1);
        orderItem1.setItem(movie_cruella); //(의문)업캐스팅이 되나? abstract 키워드를 붙혀야할까?
        orderItem1.setOrder(order_by_Emma_Stone);
        orderItem2.setQuantity(1);
        orderItem2.setItem(movie_the_amazing_spider_man_2);
        orderItem2.setOrder(order_by_Emma_Stone);
        orderItem3.setQuantity(1);
        orderItem3.setItem(book_1Q84);
        orderItem3.setOrder(order_by_Emma_Stone);
        em.persist(orderItem1);
        em.persist(orderItem2);
        em.persist(orderItem3);

        tx.commit();

        em.close();

        emf.close();
    }
}
