/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackethon.smart.smartindiahackethon.service;

import org.hackethon.smart.smartindiahackethon.entity.Employee;
import org.hackethon.smart.smartindiahackethon.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author KrisH
 */

@Service
public class AdminServiceImpl implements AdminService
{
    
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public boolean registerEmployee(Employee employee) {
        try {
        return employeeRepository.saveAndFlush(employee) != null;    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
       
}
