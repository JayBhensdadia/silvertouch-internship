package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAllContacts();

    Contact getContact(Long id);

    public void saveContactService(Contact contact);

    public Contact fetchContactByEmployeeId(Long empId);

    public void deleteContactByEmployeeId(Long empId);
}
