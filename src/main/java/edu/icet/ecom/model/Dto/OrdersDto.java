package edu.icet.ecom.model.Dto;

import edu.icet.ecom.model.Entity.CustomerEntity;
import edu.icet.ecom.model.Entity.FoodItemsEntity;
import edu.icet.ecom.service.FoodItemService;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrdersDto {

    private Long orderId;
    private Long custid;
    private Long itemcode;
    private String itemDescription;
    private Double unitPrice;
    private int qtyOnHand;
    private Double total;

    public OrdersDto(Long orderId, String itemDescription, CustomerEntity customerEntity, FoodItemsEntity foodItemsEntity, Double unitPrice, int qtyOnHand, Double total) {
        this.orderId = orderId;
        this.total = total;
        this.qtyOnHand = qtyOnHand;
        this.itemDescription = itemDescription;
        this.unitPrice = unitPrice;
        this.custid = customerEntity.getCustid();
        this.itemcode = foodItemsEntity.getItemcode();
    }
}
