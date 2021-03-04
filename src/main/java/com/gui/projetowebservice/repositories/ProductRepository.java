package com.gui.projetowebservice.repositories;

import com.gui.projetowebservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
