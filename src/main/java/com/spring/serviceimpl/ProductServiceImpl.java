
package com.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DaoProduct;
import com.spring.entity.Product;
import com.spring.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private DaoProduct productDao;

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
	public List<Product> productsByCategoryAndBrandId(long brandId, long catId) {
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
	public void addItem(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteItem(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateItem(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> listItem() {
		return productDao.listItem();
	}
   
    
}
