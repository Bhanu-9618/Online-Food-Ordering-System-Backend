package edu.icet.ecom.model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class AddtoCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartid;

    @Column(nullable = false , unique = true)
    private Long orderId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customerEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_code")
    private FoodItemsEntity foodItemsEntity;

    @Column(nullable = false , name = "item_description")
    private String itemDescription;

    @Column(nullable = false)
    private Double unitPrice;

    @Column(nullable = false , name = "qty")
    private int qtyOnHand;

    @Column(nullable = false)
    private Double total;

}
