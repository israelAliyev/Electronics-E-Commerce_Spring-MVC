/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import java.util.List;

import com.spring.entity.Brand;

public interface DaoBrand {

	void addItem(Brand brand);

	void deleteItem(Brand brand);

	void updateItem(Brand brand);

	List<Brand> listItem();
    
}
