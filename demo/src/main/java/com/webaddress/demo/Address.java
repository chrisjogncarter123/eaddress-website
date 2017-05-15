package com.webaddress.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ChrisJohnCarter on 5/15/17.
 */

@Entity
@Table(name="ADDRESS")
public class Address {
    @Id
    @Column(name="FULLADDRESS")
    private String fullAddress;


    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
