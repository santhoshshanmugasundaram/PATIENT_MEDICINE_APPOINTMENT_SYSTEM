package com.Patient.Medicine.and.Appointment.System.repo;

import com.Patient.Medicine.and.Appointment.System.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    //Method to find Doctor by Id
    Optional<Doctor> findById(int doctorId);

}
