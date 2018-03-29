/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackethon.smart.smartindiahackethon.repository;

import org.hackethon.smart.smartindiahackethon.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KrisH
 */


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    
}
