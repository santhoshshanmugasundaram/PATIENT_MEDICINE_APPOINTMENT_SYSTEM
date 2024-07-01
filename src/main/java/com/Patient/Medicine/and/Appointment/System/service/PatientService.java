package com.Patient.Medicine.and.Appointment.System.service;


import com.Patient.Medicine.and.Appointment.System.DTO.PatientRegistrationDto;
import com.Patient.Medicine.and.Appointment.System.model.PatientUser;

public interface PatientService {

    //Method to Save patient using DTO
    PatientUser save(PatientRegistrationDto registrationDto);

}
