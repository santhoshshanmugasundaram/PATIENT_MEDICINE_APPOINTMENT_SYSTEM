package com.Patient.Medicine.and.Appointment.System.service;


import com.Patient.Medicine.and.Appointment.System.model.Doctor;
import com.Patient.Medicine.and.Appointment.System.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    //Method to Display ALl Doctors
    public List<Doctor> displayAllDoctors(){
        return doctorRepository.findAll();
    }

    //Method to findDoc by Id
    public Doctor findDocById(int doctorId){
        return  doctorRepository.findById(doctorId).orElse(null);
    }
}
