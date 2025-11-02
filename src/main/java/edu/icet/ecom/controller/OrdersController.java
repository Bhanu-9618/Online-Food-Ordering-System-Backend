package edu.icet.ecom.controller;

import edu.icet.ecom.model.Dto.OrdersDto;
import edu.icet.ecom.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @PostMapping("/addtoOrders")
    public void addtoOrders(@RequestBody OrdersDto ordersDto){
        ordersService.addtoOrders(ordersDto);
    }

    @GetMapping("view/{orderid}")
    public List<OrdersDto> viewOrders(@PathVariable Long orderid){
        return ordersService.viewOrders(orderid);
    }

}