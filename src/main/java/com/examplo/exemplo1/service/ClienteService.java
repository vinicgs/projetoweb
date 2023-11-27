/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examplo.exemplo1.service;

import com.examplo.exemplo1.model.Pessoa;

import java.util.List;


public interface ClienteService {
    List<Pessoa> getAllEmployees();
    void save(Pessoa emp);
    Pessoa getEmployeeByID(long id);
    void deleteEmployeeById(long id);


}
