package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.repository.AttachmentRepository;
import com.jaybhensdadia.hrms.entity.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImplementation implements AttachmentService{

    @Autowired
    private AttachmentRepository attachmentRepository;


    @Override
    public void saveAttachment(Attachment attachment) {
        attachmentRepository.save(attachment);
    }

    @Override
    public Attachment fetchAttachmentById(Long id) {
        return attachmentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Attachment> fetchAllAttachments() {
        return attachmentRepository.findAll();
    }

    @Override
    public List<Attachment> fetchByEmployeeId(Long id) {
        return attachmentRepository.findByEmployeeId(id);
    }

    @Override
    public void deleteAttachmentByEmpId(Long empId) {
        attachmentRepository.deleteByEmpId(empId);
    }

}
