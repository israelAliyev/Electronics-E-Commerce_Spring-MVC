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

/**
 * Brand generated by hbm2java
 */
@Entity
@Table(name="brand"
    ,catalog="webshopping"
    , uniqueConstraints = @UniqueConstraint(columnNames="brand_name") 
)
public class Brand  implements java.io.Serializable {


     private long brandId;
     private String brandName;
     private short status;
     private Set <Product> products = new HashSet();

    public Brand() {
    }

	
    public Brand(long brandId, String brandName, short status) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.status = status;
    }
    public Brand(long brandId, String brandName, short status, Set <Product> products) {
       this.brandId = brandId;
       this.brandName = brandName;
       this.status = status;
       this.products = products;
    }
   
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="brand_id", unique=true, nullable=false)
    public long getBrandId() {
        return this.brandId;
    }
    
    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    
    @Column(name="brand_name", unique=true, nullable=false, length=50)
    public String getBrandName() {
        return this.brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    
    @Column(name="status", nullable=false)
    public short getStatus() {
        return this.status;
    }
    
    public void setStatus(short status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="brand",cascade = CascadeType.ALL)
    public Set <Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set <Product> products) {
        this.products = products;
    }




}


