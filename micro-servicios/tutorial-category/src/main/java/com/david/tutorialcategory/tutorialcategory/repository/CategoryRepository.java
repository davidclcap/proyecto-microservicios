package com.david.tutorialcategory.tutorialcategory.repository;

import com.david.tutorialcategory.tutorialcategory.model.Category;
import org.springframework.data.repository.CrudRepository;


public interface CategoryRepository extends CrudRepository<Category, Long> {
}
