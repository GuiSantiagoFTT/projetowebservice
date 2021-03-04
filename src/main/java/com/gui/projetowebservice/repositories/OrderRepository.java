package com.gui.projetowebservice.repositories;

import com.gui.projetowebservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
