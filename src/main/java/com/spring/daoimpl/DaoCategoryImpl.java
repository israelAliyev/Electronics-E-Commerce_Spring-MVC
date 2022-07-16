/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.daoimpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.DaoCategory;
import com.spring.entity.Category;



@Repository
public class DaoCategoryImpl implements DaoCategory {

	@Autowired
	private HibernateTemplate hibernateTemplate;


	@Override
	@Transactional
	public void addItem(Category category) {
		this.hibernateTemplate.save(category);
	}

	@Override
	@Transactional
	public void deleteItem(Category category) {

		this.hibernateTemplate.bulkUpdate("Update Category set status = ? where categoryId = ?", category.getStatus(),
				category.getCategoryId());

	}

	@Override
	@Transactional
	public void updateItem(Category category) {
		this.hibernateTemplate.bulkUpdate("Update Category set categoryName = ? where categoryId = ?",
				category.getCategoryName(), category.getCategoryId());
	}

	@Override
	@Transactional
	public List<Category> listItem() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Category.class);

		detachedCriteria.add(Restrictions.eq("status", (short) 1));

		return (List<Category>) this.hibernateTemplate.findByCriteria(detachedCriteria);

	}

	@Override
	public List<Category> trashList() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Category.class);

		detachedCriteria.add(Restrictions.eq("status", (short) 0));

		return (List<Category>) this.hibernateTemplate.findByCriteria(detachedCriteria);
	}

	@Override
	@Transactional
	public void delteTrash() {

		this.hibernateTemplate.bulkUpdate("delete from Category where status=?", (short) 0);

	}

	@Override
	@Transactional

	public void buckUpItem(Category category) {

		this.hibernateTemplate.bulkUpdate("Update Category set status = ? where categoryId = ?", category.getStatus(),
				category.getCategoryId());

	}

	@Override
	@Transactional
	public void deleteTrashItem(Category category) {

		this.hibernateTemplate.delete(category);

	}
    

}
