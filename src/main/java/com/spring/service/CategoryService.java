/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import java.util.List;

import com.spring.entity.Category;

/**
 *
 * @author israil
 */
public interface CategoryService {

	void addItem(Category category);

	void deleteItem(Category category);

	void updateItem(Category category);

	List<Category> listItem();

	void deleteTrashItem(Category category);

	List<Category> trashList();

	void deleteTrash();

	void buckUpItem(Category category);

}
