package com.frankmoley.landon.data.entity;

import javax.persistence.*;

/**
 * Created by talenthub17 on 13/05/2017.
 */
@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private long productID;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRODUCT_QUANTITY")
    private int productQuantity;

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}