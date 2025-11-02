package edu.icet.ecom.model.Dto;

import edu.icet.ecom.model.Entity.CustomerEntity;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodItemDto {

    private Long itemcode;
    private String description;
    private String packSize;
    private int qtyOnHand;
    private Double unitPrice;

    public FoodItemDto(Long orderId, String itemDescription, CustomerEntity customerEntity, Double unitPrice, int qtyOnHand, Double total) {

    }
}
