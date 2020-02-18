package com.tp3.tp.Repositories;


import com.tp3.tp.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByProdName(final String prodName);

}
