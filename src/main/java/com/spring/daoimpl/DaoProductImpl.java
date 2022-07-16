
package com.spring.daoimpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.DaoProduct;
import com.spring.entity.Product;

@Repository
public class DaoProductImpl implements DaoProduct {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> latestProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> productsByCategoryId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> productsByBrandId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> productsByCategoryAndBrandId(long catId, long brandId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> productsByPagenation(int pageNumber, long catId, long brandId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByProductId(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void addItem(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteItem(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void updateItem(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> listItem() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Product.class);

		detachedCriteria.add(Restrictions.eq("status", (short) 1));

		return (List<Product>) this.hibernateTemplate.findByCriteria(detachedCriteria);
	}


   
}
