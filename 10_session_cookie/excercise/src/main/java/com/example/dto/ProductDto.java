package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ProductDto {

    private int id;
    private String name;
    private String image;
    private long price;
    private short discount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return id == that.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, price, discount);
    }
}
