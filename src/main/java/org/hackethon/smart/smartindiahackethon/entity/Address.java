/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackethon.smart.smartindiahackethon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author KrisH
 */

@Entity
public class Address 
{
    private long addressid;
    private String address_line;
    private Long  pincode;
    private String city;
    private String state;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getAddressid() {
        return addressid;
    }

    public void setAddressid(long addressid) {
        this.addressid = addressid;
    }
    
    
    
    

    public String getAddress_line() {
        return address_line;
    }

    public void setAddress_line(String address_line) {
        this.address_line = address_line;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
    
}
