package com.frankmoley.landon.business.domain;

import java.util.Date;

public class Shopping {
    private long shoppingId;
    private long customerId;
    private long productId;
    private String productName;
    private int productQuantity;
    private String customerName;
    private Date date;

    public Shopping() {}

    public Shopping(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
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
}
