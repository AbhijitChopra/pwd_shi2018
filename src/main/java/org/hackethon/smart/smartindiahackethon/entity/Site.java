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
public class Site {
    private int siteid;
    private String sitename;
    private double latitute;
    private double logitute;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSiteid() {
        return siteid;
    }

    public void setSiteid(int siteid) {
        this.siteid = siteid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public double getLatitute() {
        return latitute;
    }

    public void setLatitute(double latitute) {
        this.latitute = latitute;
    }

    public double getLogitute() {
        return logitute;
    }

    public void setLogitute(double logitute) {
        this.logitute = logitute;
    }
    
    
    
}
