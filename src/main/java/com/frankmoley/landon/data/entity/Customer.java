package com.frankmoley.landon.data.entity;
import javax.persistence.*;

/**
 * Created by talenthub17 on 13/05/2017.
 */

@Entity
@Table(name="CUSTOMER")
public class Customer {


    @Column(name = "CUSTOMER_ID")
    private long customerID;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "CUSTOMER_TYPE")
    private boolean customerType; //  Buyyer = 0, Seller = 1


    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isCustomerType() {
        return customerType;
    }

    public void setCustomerType(boolean customerType) {
        this.customerType = customerType;
    }

}
