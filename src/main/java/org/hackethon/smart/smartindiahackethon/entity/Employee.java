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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author KrisH
 */

@Entity
public class Employee 
{
   private long employeeid;  
   private String firstname;
   private String middlename;
   private String lastname;
   private Address address_temp;
   private Address address_per;
   private Long phone;
   private String email;
   private String gender;
   private Long aadhar_no;
   private String religion;
   private String username;
   private String passsword;
   private String empid;
   
   private Juridiction juridiction;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }
   
   
   
   

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @OneToOne
    @JoinColumn(name="emp_add_temp")
    public Address getAddress_temp() {
        return address_temp;
    }

    public void setAddress_temp(Address address_temp) {
        this.address_temp = address_temp;
    }

    
    @OneToOne
    @JoinColumn(name="emp_add_per")
    public Address getAddress_per() {
        return address_per;
    }

    public void setAddress_per(Address address_per) {
        this.address_per = address_per;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(Long aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    @OneToOne
    @JoinColumn(name = "juridictionid")
    public Juridiction getJuridiction() {
        return juridiction;
    }

    public void setJuridiction(Juridiction juridiction) {
        this.juridiction = juridiction;
    }
    
    
    
    
   
   
}


