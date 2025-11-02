package edu.icet.ecom.model.Dto;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodItemDto {

    private Long itemcode;
    private String description;
    private int packSize;
    private Double unitPrice;
    private int qtyOnHand;
}
