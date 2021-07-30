package shop.domain;

import shop.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
Member(일) --- (다)Order
연관관계 주인 : Order
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime orderDate;

    @Enumerated(value = EnumType.STRING )
    private Status orderStatus;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

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

    public Status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }
}
