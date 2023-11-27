/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examplo.exemplo1.controller;

import com.examplo.exemplo1.model.Pessoa;
import com.examplo.exemplo1.service.ClienteService;
import com.examplo.exemplo1.validation.IValidacoaCadastroPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/persons")
public class EmployeeController {
    
    @Autowired
    private ClienteService clienteService;

    @Autowired
    private List<IValidacoaCadastroPessoa> validations;
    
    @GetMapping
    public String getViewHomePage(Model model){
        List<Pessoa> allEmployees = clienteService.getAllEmployees();
        model.addAttribute("listEmployees", allEmployees);
        return "index";
    }
    
    @GetMapping(value ="/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Pessoa employee = new Pessoa();
        model.addAttribute("pessoa", employee);
        return "new_cliente";
    }
    
    @PostMapping(value ="/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Pessoa employee){
        clienteService.save(employee);
        return "redirect:/";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id,Model model){
        Pessoa employee = clienteService.getEmployeeByID(id);
        model.addAttribute("employee", employee);
        
        return "update_cliente";
    }
    
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id){
        this.clienteService.deleteEmployeeById(id);
        
        return "redirect:/";
    }
}
