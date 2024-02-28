package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.ContactRepository;
import com.jaybhensdadia.hrms.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImplementation implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContact(Long id) {
        return contactRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveContactService(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public Contact fetchContactByEmployeeId(Long empId) {
         return contactRepository.findContactByEmployeeId(empId);
    }

    @Override
    public void deleteContactByEmployeeId(Long empId) {
        contactRepository.deleteByEmpId(empId);
    }
}
