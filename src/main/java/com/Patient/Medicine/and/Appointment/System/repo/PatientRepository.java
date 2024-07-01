package com.Patient.Medicine.and.Appointment.System.repo;
import com.Patient.Medicine.and.Appointment.System.model.PatientUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<PatientUser,Long> {

    //Method to find patient by Email
    PatientUser findByEmail(String email);

    //Method to find user by their userId
    Optional<PatientUser> findById(long id);
}





