package com.jaybhensdadia.hrms.service;


import com.jaybhensdadia.hrms.entity.Emergency;

public interface EmergencyService {

    Emergency getEmergencyById(Long id);

    public void saveEmergency(Emergency emergency);

    public Emergency fetchEmergencyByEmpId(Long empId);


    public void deleteEmergencyByEmpId(Long empId);
}
