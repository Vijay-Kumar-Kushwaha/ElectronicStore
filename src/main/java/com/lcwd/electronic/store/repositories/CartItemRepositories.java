package com.lcwd.electronic.store.repositories;

import com.lcwd.electronic.store.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepositories extends JpaRepository<CartItem, Integer> {


}
