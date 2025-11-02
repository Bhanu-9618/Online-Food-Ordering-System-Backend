package edu.icet.ecom.service;

import edu.icet.ecom.model.Dto.OrdersDto;
import edu.icet.ecom.model.Entity.OrdersEntity;
import edu.icet.ecom.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    OrdersRepository ordersRepository;

    public void addtoOrders(OrdersDto ordersDto) {
        List<OrdersEntity> ordersEntities = ordersRepository.findAll();

        for (OrdersEntity ordersEntity : ordersEntities) {
            if (ordersEntity.getFoodItemsEntity().getItemcode() == ordersDto.getOrderId()) {
                OrdersEntity ordersEntity1 = new OrdersEntity(
                        ordersDto.getItemcode(),
                        ordersDto.getOrderId(),
                        ordersDto.getCustid(),
                        ordersDto.getItemDescription(),
                        ordersDto.getQtyOnHand(),
                        ordersDto.getUnitPrice(),
                        ordersDto.getTotal()
                );
                ordersRepository.save(ordersEntity1);
            }
        }
    }

    public List<OrdersDto> viewOrders(Long orderid) {
        List<OrdersEntity> ordersEntities = ordersRepository.findAll();
        List<OrdersDto> ordersDtos = new ArrayList<>();
        for (OrdersEntity ordersEntity : ordersEntities) {
            if(ordersEntity.getOrderId() == orderid) {
                ordersDtos.add(new OrdersDto(
                        ordersEntity.getOrderId(),
                        ordersEntity.getItemDescription(),
                        ordersEntity.getCustomerEntity(),
                        ordersEntity.getFoodItemsEntity(),
                        ordersEntity.getUnitPrice(),
                        ordersEntity.getQtyOnHand(),
                        ordersEntity.getTotal()
                        )
                );
            }
        }
        return ordersDtos;
    }
}
