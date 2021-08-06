package shop.domain;

import shop.OrderStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
Member(일) --- (다)Order
연관관계 주인 : Order

Order(1) --- (1)Delivery
연관관계 주인 설정하는 법?
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime orderDate;

    @Enumerated(value = EnumType.STRING )
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    //----------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
