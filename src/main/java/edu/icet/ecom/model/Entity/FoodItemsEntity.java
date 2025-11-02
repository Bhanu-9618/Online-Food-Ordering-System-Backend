package edu.icet.ecom.model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FoodItemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemcode;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String packSize;

    @Column(nullable = false)
    private Double unitPrice;

    @Column(nullable = false)
    private int qtyOnHand;

}
