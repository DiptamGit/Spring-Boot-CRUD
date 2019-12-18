package com.diptam.SpringBootCRUD.Repository;

import com.diptam.SpringBootCRUD.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
