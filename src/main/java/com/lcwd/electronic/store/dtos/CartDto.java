package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.entities.CartItem;
import com.lcwd.electronic.store.entities.User;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartDto {
    private String cartId;
    private Date createdAt;
    private UserDto user;
    private List<CartItemDto> items = new ArrayList<>();
}
