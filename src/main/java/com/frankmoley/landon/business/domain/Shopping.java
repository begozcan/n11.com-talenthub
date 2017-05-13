package com.frankmoley.landon.business.domain;

import java.util.Date;

public class Shopping {
    private long shoppingId;
    private long customerId;
    private long productId;
    private int productQuantity;
    private String title;
    private String subtitle;
    private String category;
    private long price;
    private long discountPrice;
    private String customerName;
    private Date date;

    public Shopping() {}

    public Shopping(String title, String subtitle, String category, long price, long discountPrice) {
        this.title = title;
        this.subtitle = subtitle;
        this.category = category;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public long getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(long shoppingId) {
        this.shoppingId = shoppingId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
}
