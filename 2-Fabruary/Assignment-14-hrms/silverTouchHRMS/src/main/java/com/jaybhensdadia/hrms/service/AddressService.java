package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Address;

import java.util.List;

public interface AddressService {

    public List<Address> fetchAllAddresses();

    public Address fetchById(Long id);

    public void saveAddress(Address address);

    public void updateAddress(Address address);

    public void deleteAddressByEmpId(Long empId);
}
