package com.Patient.Medicine.and.Appointment.System.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParentController {

    //Endpoint for Login Page
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    //Endpoint for HomePage
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}