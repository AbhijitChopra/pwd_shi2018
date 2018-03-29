/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackethon.smart.smartindiahackethon.service;

import org.hackethon.smart.smartindiahackethon.entity.Employee;
import org.springframework.stereotype.Service;

/**
 *
 * @author KrisH
 */


@Service
public interface AdminService 
{
    public boolean registerEmployee(Employee employee);
}
