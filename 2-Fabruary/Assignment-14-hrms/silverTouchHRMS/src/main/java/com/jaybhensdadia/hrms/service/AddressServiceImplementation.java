package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.repository.AddressRepository;
import com.jaybhensdadia.hrms.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImplementation implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> fetchAllAddresses() {
        return this.addressRepository.findAll();
    }

    @Override
    public Address fetchById(Long id) {
        return this.addressRepository.findById(id).get();
    }

    @Override
    public void saveAddress(Address address) {
        this.addressRepository.save(address);
    }

    @Override
    public void updateAddress(Address address) {

        // Do it yourself
//
//        if(!Objects.nonNull(address.getAddress()) || "".equals(address.getAddress())){
//
//        }
    }

    @Override
    public void deleteAddressByEmpId(Long empId) {
        addressRepository.deleteByEmpId(empId);
    }


}
