package com.spring.entity;
// Generated 22.Ağu.2020 12:15:05 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="category"
    ,catalog="webshopping"
    , uniqueConstraints = @UniqueConstraint(columnNames="category_name") 
)
public class Category  implements java.io.Serializable {


	private long categoryId;


		@NotEmpty(message = "Category bos ola bilmez")
		@Size(min = 1, max = 40, message = "Simvol sayi 0 la 40 arasinda olmalidir")
     private String categoryName;

     private short status;
     private Set <Product> products = new HashSet();

    public Category() {
    }

	
    public Category(String categoryName, short status) {
        this.categoryName = categoryName;
        this.status = status;
    }
    public Category(String categoryName, short status, Set <Product> products) {
       this.categoryName = categoryName;
       this.status = status;
       this.products = products;
    }
   
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="category_id", unique=true, nullable=false)
	public long getCategoryId() {
        return this.categoryId;
    }
    
	public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="category_name", unique=true, nullable=false, length=50)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    
    @Column(name="status", nullable=false)
    public short getStatus() {
        return this.status;
    }
    
    public void setStatus(short status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="category",cascade = CascadeType.ALL)
    public Set <Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set <Product> products) {
        this.products = products;
    }




}


