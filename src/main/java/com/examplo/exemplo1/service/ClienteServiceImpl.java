/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examplo.exemplo1.service;

import com.examplo.exemplo1.model.Pagamento;
import com.examplo.exemplo1.model.Pessoa;
import com.examplo.exemplo1.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
            
    @Override
    public List<Pessoa> getAllEmployees() {
        return clienteRepository.findAll();
    }

    @Override
    public void save(Pessoa emp) {
        this.clienteRepository.save(emp);
    }

    @Override
    public Pessoa getEmployeeByID(long id) {
        Optional<Pessoa> optional = clienteRepository.findById(id);
        Pessoa employee = null;
        if (optional.isPresent()){
            employee = optional.get();
        }
        else{
            throw new RuntimeException("Employee not found!");
        }
        
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
       this.clienteRepository.deleteById(id);
    }


    public void savePagamento(Pagamento pagamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
