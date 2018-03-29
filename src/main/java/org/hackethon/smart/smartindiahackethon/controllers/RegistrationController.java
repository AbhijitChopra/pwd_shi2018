/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackethon.smart.smartindiahackethon.controllers;

import org.hackethon.smart.smartindiahackethon.entity.Employee;
import org.hackethon.smart.smartindiahackethon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author KrisH
 */

@Controller
@RequestMapping("/api")
public class RegistrationController {
    
    @Autowired
    private AdminService adminService;
    
   @GetMapping
   public String getRegistrationPage(Model model)
   {
       model.addAttribute("employee", new Employee());
       return "registration";
   }
    
    
    @PostMapping
    public String userRegister(@ModelAttribute("employee")Employee employee,Model model)
    {
      
        
        if(adminService.registerEmployee(employee))
        {
            model.addAttribute("message", "Registration Successful");
            return "inbox";
        }
        else
        {
             model.addAttribute("message", "Registration Failuure");
             model.addAttribute("employee",new Employee());
             return "registration";
        }
    }
}
