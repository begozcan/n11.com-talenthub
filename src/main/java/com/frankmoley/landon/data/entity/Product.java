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
    @Column(name = "PRODUCT_TITLE")
    private String title;
    @Column(name = "PRODUCT_SUBTITLE")
    private String subtitle;
    @Column(name = "PRODUCT_PRICE")
    private long price;
    @Column(name = "PRODUCT_DISCOUNT_PRICE")
    private long discountPrice;
    @Column(name = "PRODUCT_CATEGORY")
    private String category;
    @Column(name = "PRODUCT_QUANTITY")
    private int productQuantity;

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(long discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}