/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DaoCategory;
import com.spring.entity.Category;
import com.spring.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private DaoCategory categoryDao;

	@Override
	public void addItem(Category category) {

		this.categoryDao.addItem(category);

	}

	@Override
	public void deleteItem(Category category) {

		this.categoryDao.deleteItem(category);

	}

	@Override
	public void updateItem(Category category) {
		this.categoryDao.updateItem(category);

	}

	@Override
	public List<Category> listItem() {

		return this.categoryDao.listItem();
	}

	@Override
	public List<Category> trashList() {

		return this.categoryDao.trashList();

	}

	@Override
	public void deleteTrash() {
		this.categoryDao.delteTrash();
	}

	@Override
	public void buckUpItem(Category category) {

		this.categoryDao.buckUpItem(category);

	}

	@Override
	public void deleteTrashItem(Category category) {
		this.categoryDao.deleteTrashItem(category);
	}
 

   
    
}
