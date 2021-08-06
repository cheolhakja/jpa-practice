package shop.domain;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue
    //규칙을 정해서 snake_case 로 @Column @Table 이런거 다 매핑해보자
    private Long id;

    private String name;

    //---셀프매핑
    /*
    @OneToMany(mappedBy = "categories")
    private List<Category> categories = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

     */
}
