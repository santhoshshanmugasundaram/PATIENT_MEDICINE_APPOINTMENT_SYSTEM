PATIENT_MEDICINE_APPOINTMENT_SYSTEM

This project is a comprehensive Patient Medicine Appointment System developed using Spring Boot.
It provides functionalities for managing patient records, doctor details, medicines, and appointments. 
The system incorporates user authentication and role-based access control, specifically for patients.
Please refer to the provided Drive link for the frontend, documentation, and screenshots. 
Be sure to review the mandatory information before use.

Table of Contents:

1.Features
2.Technologies Used
3.Setup and Configuration
4.API Endpoints
5.Data Validation Rules
6.Mandatory Information
7.Frontend


Features:

User Registration and Authentication
Manage Patient Information
Manage Doctor Information
Manage Medicine Information
Schedule and Manage Appointments

Technologies Used:

Backend: Java, Spring Boot, Spring Security, Spring Data JPA
Frontend: Thymeleaf
Database: H2 (development), MySQL (production)

Setup and Configuration

1.Prerequisites

Java 8 or higher
Maven
MySQL (for production environment)

2.Configure the Database

Development Environment: Uses H2 Database by default. No additional setup required.
Production Environment:
Create a MySQL database.
Update application.properties with your MySQL credentials.

Running the Application
bash
mvn clean install
mvn spring-boot:run

The application will be accessible at http://localhost:8080.

API Endpoints

User Registration and Authentication
GET /registration: Show the registration form.
POST /registration: Register a new user.

Patient Management
GET /home: View the home page.
GET /displayMedicine: View all medicines for the logged-in patient.
GET /addMedicine: Show the form to add a new medicine.
POST /save: Save a new medicine.
GET /medicineUpdateById: Show the form to update medicine quantity.
PUT /saveUpdate: Update the medicine quantity.

Doctor Management
GET /displayDoctors: View all doctors.
GET /bookAppointment/{doctorId}: Show the form to book an appointment with a doctor.

Appointment Management
GET /appointment/{doctorId}: Show the appointment form.
POST /saveAppointment: Save a new appointment.
GET /displayAppointments: View all appointments for the logged-in patient.

Data Validation Rules
Patient Registration
firstName: Must not be empty.
lastName: Must not be empty.
email: Must be a valid email format and not empty.
password: Must not be empty, with a minimum length of 6 characters.

Medicine
name: Must not be empty.
quantity: Must not be empty, and must be a positive integer.

Mandatory Information
Single User Role: Only patient access is available, no admin or separate credential logins.
Database Initialization: Insert doctor details before testing the application.

sql
INSERT INTO doctor (name, specialization, available_slots) VALUES
('Dr. John Doe', 'Cardiology', 10),
('Dr. Jane Smith', 'Neurology', 8);

Frontend
View the frontend, using this Drive link.


***Thank you***















