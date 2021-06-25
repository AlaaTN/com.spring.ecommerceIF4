package com.spring.ecommerce.Repository;

import com.spring.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}
