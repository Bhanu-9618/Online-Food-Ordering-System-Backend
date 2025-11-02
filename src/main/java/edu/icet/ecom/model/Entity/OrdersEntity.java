package edu.icet.ecom.model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrdersEntity {

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

    public OrdersEntity(Long itemcode, Long orderId, Long custid, String itemDescription, int qtyOnHand, Double unitPrice, Double total) {

    this.foodItemsEntity.setItemcode(itemcode);
    this.itemDescription = itemDescription;
    this.unitPrice = unitPrice;
    this.qtyOnHand = qtyOnHand;
    this.total = total;
    this.orderId = orderId;
    this.customerEntity.setCustid(custid);
    }
}
