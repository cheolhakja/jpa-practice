package shop.domain;

import shop.DeliveryStatus;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    private String city;
    private String streetName;
    private String zipcode;

    @Enumerated(value = EnumType.STRING)
    private DeliveryStatus deliveryStatus;
}
