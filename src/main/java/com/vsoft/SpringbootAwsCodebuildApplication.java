package com.vsoft;

import com.vsoft.model.Order;
import com.vsoft.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/order")
public class SpringbootAwsCodebuildApplication {

	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsCodebuildApplication.class, args);
	}

	@GetMapping
	public List<Order> getOrders(){
		return orderRepository.getOrders();
	}
}
