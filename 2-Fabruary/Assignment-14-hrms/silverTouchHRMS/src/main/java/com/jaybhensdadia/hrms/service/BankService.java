package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Bank;

import java.util.List;

public interface BankService {

    List<Bank> getAllBank();

    public void saveBank(Bank bank);

    public Bank fetchBankById(Long id);

    public void deleteBankByEmployeeId(Long empId);
}
