package com.vsoft.repository;

import com.vsoft.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public class OrderRepository {

    public List<Order> getOrders(){
        return (List<Order>) Stream.of(
                new Order(101,"Mobile", 400,30000.00),
                new Order(102,"Book", 300,150.00),
                new Order(103,"Laptop", 10,75000.00),
                new Order(104,"Headset", 500,450.00),
                new Order(105,"Watch", 100,3000.00)
        );
    }
}
