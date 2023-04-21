package com.david.tutorialcategory.tutorialcategory.service;

import com.david.tutorialcategory.tutorialcategory.model.Category;
import com.david.tutorialcategory.tutorialcategory.model.CategoryDto;

import java.util.List;

public interface CategoryService {
    /**
     * Recupera una {@link Category} a partir de su ID
     *
     * @param id PK de la entidad
     * @return {@link Category}
     */
    Category get(Long id);

    /**
     * Método para recuperar todas las {@link Category}
     *
     * @return {@link List} de {@link Category}
     */
    List<Category> findAll();

    /**
     * Método para crear o actualizar una {@link Category}
     *
     * @param id PK de la entidad
     * @param dto datos de la entidad
     */
    void save(Long id, CategoryDto dto);

    /**
     * Método para borrar una {@link Category}
     *
     * @param id PK de la entidad
     */
    void delete(Long id) throws Exception;
}
