/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import java.util.List;

import com.spring.entity.Product;

/**
 *
 * @author israil
 */
public interface ProductService {
    
        List<Product> latestProduct();
    List<Product> productsByCategoryId(long id);
    List<Product> productsByBrandId(long id);
     List<Product> productsByCategoryAndBrandId(long brandId,long catId);
     List<Product> productsByPagenation(int pageNumber,long catId,long brandId);
      Product findByProductId(long productId);

		void addItem(Product product);

		void deleteItem(Product product);

		void updateItem(Product product);

		List<Product> listItem();

    
}
