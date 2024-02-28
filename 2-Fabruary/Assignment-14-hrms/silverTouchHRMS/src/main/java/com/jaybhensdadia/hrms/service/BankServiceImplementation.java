package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.BankRepository;
import com.jaybhensdadia.hrms.entity.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImplementation implements BankService{

    @Autowired
    private BankRepository bankRepository;

    @Override
    public List<Bank> getAllBank() {
        return bankRepository.findAll();
    }

    @Override
    public void saveBank(Bank bank) {
        bankRepository.save(bank);
    }

    @Override
    public Bank fetchBankById(Long id) {
        return bankRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteBankByEmployeeId(Long empId) {
        bankRepository.deleteByEmpId(empId);
    }


}
