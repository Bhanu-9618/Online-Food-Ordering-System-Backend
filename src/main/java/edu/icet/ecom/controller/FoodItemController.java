package edu.icet.ecom.controller;

import edu.icet.ecom.model.Dto.FoodItemDto;
import edu.icet.ecom.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Food")
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @GetMapping("/food")
    public List<FoodItemDto> viewFoodTable(){
       return foodItemService.viewFoodTable();
    }
}
