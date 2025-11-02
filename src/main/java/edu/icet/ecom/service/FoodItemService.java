package edu.icet.ecom.service;

import edu.icet.ecom.model.Dto.FoodItemDto;
import edu.icet.ecom.model.Entity.FoodItemsEntity;
import edu.icet.ecom.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    FoodItemRepository foodItemRepository;

    public List<FoodItemDto> viewFoodTable() {
        List<FoodItemsEntity> foodItemsEntities = foodItemRepository.findAll();
        List<FoodItemDto> foodItemDtos = new ArrayList<>();

        for (FoodItemsEntity foodItemsEntity : foodItemsEntities) {
            foodItemDtos.add(new FoodItemDto(
                            foodItemsEntity.getItemcode(),
                            foodItemsEntity.getDescription(),
                            foodItemsEntity.getPackSize(),
                            foodItemsEntity.getUnitPrice(),
                            foodItemsEntity.getQtyOnHand()
                    )
            );

        }
        return foodItemDtos;
    }
}

