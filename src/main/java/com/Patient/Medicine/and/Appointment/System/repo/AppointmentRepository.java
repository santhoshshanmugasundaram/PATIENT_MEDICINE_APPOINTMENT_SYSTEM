package com.Patient.Medicine.and.Appointment.System.repo;


import com.Patient.Medicine.and.Appointment.System.model.Appointment;
import com.Patient.Medicine.and.Appointment.System.model.PatientUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

    //Method to find user
    List<Appointment> findByPatientUser(PatientUser patientUser);

}
