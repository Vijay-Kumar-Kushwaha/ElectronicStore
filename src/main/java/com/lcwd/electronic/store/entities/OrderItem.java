package com.lcwd.electronic.store.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderItemId;

    private int quantity;

    private int totalPrice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private  Product product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore  // prevents the infinite loop
    private Order order;

}
