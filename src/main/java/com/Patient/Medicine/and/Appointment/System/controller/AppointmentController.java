package com.Patient.Medicine.and.Appointment.System.controller;


import com.Patient.Medicine.and.Appointment.System.model.Appointment;
import com.Patient.Medicine.and.Appointment.System.model.Doctor;
import com.Patient.Medicine.and.Appointment.System.model.PatientUser;
import com.Patient.Medicine.and.Appointment.System.service.AppointmentService;
import com.Patient.Medicine.and.Appointment.System.service.DoctorService;
import com.Patient.Medicine.and.Appointment.System.service.PatientUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientUserService patientUserService;


    //Endpoint for Display appointment Form by DoctorID
    @GetMapping("/appointment/{doctorId}")
    public String displayAppointmentForm(@PathVariable int doctorId, Model model, Appointment appointment) {

        Doctor doctor = doctorService.findDocById(doctorId);
        model.addAttribute("appointment", new Appointment());
        model.addAttribute("doctor", doctor);
        PatientUser loggedInPatient=patientUserService.getCurrentlyLoggedInPatientUser();
        model.addAttribute("patientUser",loggedInPatient);
        return "appointment";
    }

    //Endpoint for save the appointment
    @PostMapping("/saveAppointment")
    public String appointment(@ModelAttribute("appointment") Appointment appointment,
                              @RequestParam("doctorId") int doctorId,
                              @RequestParam("patientUserId") long patientUserId) {
        Doctor doctor = doctorService.findDocById(doctorId);
        PatientUser patientUser=patientUserService.getById(patientUserId);
        appointment.setDoctorDetails(doctor);
        appointment.setPatientUser(patientUser);
        appointmentService.saveAppointment(appointment);
        return "redirect:/home";
    }

    //Endpoint for to display Appointments
    @GetMapping(value ="/displayAppointments")
    public String getAllStaffDetails(Model model){
        PatientUser loggedInPatient = patientUserService.getCurrentlyLoggedInPatientUser();
        List<Appointment> appointmentList=appointmentService.findAppointmentsByPatientUser(loggedInPatient);
        model.addAttribute("appointment",appointmentList);
        return "ViewAppointments";
    }

}
