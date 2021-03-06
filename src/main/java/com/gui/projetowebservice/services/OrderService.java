package com.gui.projetowebservice.services;

import com.gui.projetowebservice.entities.Order;
import com.gui.projetowebservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll(){
        return OrderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> Order = OrderRepository.findById(id);
        return  Order.get();
    }
}
