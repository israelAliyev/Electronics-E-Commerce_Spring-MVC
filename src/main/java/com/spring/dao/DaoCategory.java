/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import java.util.List;

import com.spring.entity.Category;

/**
 *
 * @author israil
 */
public interface DaoCategory {
    
	
	void addItem(Category category);

	void deleteItem(Category category);

	void updateItem(Category category);

	void buckUpItem(Category category);

	void deleteTrashItem(Category category);

	void delteTrash();

	List<Category> listItem();
	
	List<Category> trashList();
	
	
}
