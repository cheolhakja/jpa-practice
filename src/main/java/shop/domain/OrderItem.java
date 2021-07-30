package shop.domain;

import javax.persistence.*;

/*
OrderItem (다) --- (일)Item
단방향 (연관관계의 주인 : OrderItem)

Order(일) --- (다)OrderItem
단방향 (연관관계 주인 : OrderItem)
 */
@Entity
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    //----------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }
}
