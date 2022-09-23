package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class CategoryDto {

    Map<ProductDto, Integer> productDtoMap = new HashMap<>();

    public void addProduct(ProductDto productDto) {
        if (productDtoMap.containsKey(productDto)) {
            Integer currentValue = productDtoMap.get(productDto);
            productDtoMap.replace(productDto, currentValue + 1);
        } else {
            productDtoMap.put(productDto, 1);
        }
    }

    public void declineProduct(ProductDto productDto) {
        if (productDtoMap.containsKey(productDto) ) {
            if ( productDtoMap.get(productDto)>1){
                Integer currentValue = productDtoMap.get(productDto);
                productDtoMap.replace(productDto, currentValue - 1);
            }else {
                productDtoMap.remove(productDto);
            }

        }
    }

}
