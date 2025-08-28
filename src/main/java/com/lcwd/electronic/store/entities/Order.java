package com.lcwd.electronic.store.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private String orderId;
    //PENDING, DISPATCHED, DELIVERED
    private String orderStatus;

    //NOTPAID, PAID
    //we can use ENUM also
    //boolean-false=> NOT_PAID // true=>PAID
    private String paymentStatus;

    private int orderAmount;

    @Column(length = 1000)
    private String billingAddress;

    private String billingPhone;

    private String billingName;

    private Date orderedDate;

    private  Date deliveredDate;


    //USER
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @JsonIgnore     // ⛔ Prevent infinite loop
    private User user;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();
}
// is order ke andar multiple orderItems aa sakte hai
