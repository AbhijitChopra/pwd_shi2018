/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackethon.smart.smartindiahackethon.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author KrisH
 */

@Entity
public class Juridiction {
 private long juridictionid;
 private String juridictionanme;
 private List<Site> sites = new ArrayList<>();

 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getJuridictionid() {
        return juridictionid;
    }

    public void setJuridictionid(long juridictionid) {
        this.juridictionid = juridictionid;
    }

    public String getJuridictionanme() {
        return juridictionanme;
    }

    public void setJuridictionanme(String juridictionanme) {
        this.juridictionanme = juridictionanme;
    }

    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    @JoinTable(
            joinColumns = @JoinColumn(name = "juridictionid"),
            inverseJoinColumns = @JoinColumn(name = "siteid")
    )
    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }
 
 
 
 
}
