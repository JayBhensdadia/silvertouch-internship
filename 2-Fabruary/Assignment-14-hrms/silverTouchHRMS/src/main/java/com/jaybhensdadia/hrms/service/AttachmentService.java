package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Attachment;

import java.util.List;

public interface AttachmentService {

    public void saveAttachment(Attachment attachment);

    Attachment fetchAttachmentById(Long id);

    public List<Attachment> fetchAllAttachments();

    public List<Attachment> fetchByEmployeeId(Long empId);

    public void deleteAttachmentByEmpId(Long empId);
}
