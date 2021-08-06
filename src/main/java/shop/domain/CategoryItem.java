package shop.domain;

import shop.domain.item.Item;

import javax.persistence.*;

/*
MEMBER_ID, PRODUCT_ID를 묶어서 PK로 사용했으나,
실제로는 독립적으로 generated되는 id를 사용하는 것을 권장.
ID가 두개의 테이블에 종속되지 않고 더 유연하게 개발 할 수 있다.
 */
@Entity
public class CategoryItem {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
