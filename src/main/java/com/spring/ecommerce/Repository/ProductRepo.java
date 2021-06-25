package com.spring.ecommerce.Repository;

import java.util.List;

import com.spring.ecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Long> {
	@Query("Select pro FROM Products pro WHERE pro.category_id=:cat_id")
	List<Products> getByCategoryId(@Param("cat_id")String cat_id);
}
