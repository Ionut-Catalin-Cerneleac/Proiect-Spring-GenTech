package com.Donate.Donate.site.repository;

import com.Donate.Donate.site.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String name);
}

