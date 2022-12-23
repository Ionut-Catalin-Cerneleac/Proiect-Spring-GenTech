package com.Donate.Donate.site.service;

import com.Donate.Donate.site.domain.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
