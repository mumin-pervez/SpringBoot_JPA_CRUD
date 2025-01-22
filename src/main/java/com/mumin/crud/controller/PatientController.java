package com.mumin.crud.controller;

import com.mumin.crud.entity.Patient;
import com.mumin.crud.service.PatientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

  @Autowired
  private PatientService patientService;

  // Create patient:
  // localhost:8088/api/patients
  @PostMapping
  public Patient createPatient(@RequestBody Patient patient) {
    return patientService.addPatient(patient);
  }

  // Get All Patients:
  // localhost:8088/api/patients
  @GetMapping
  public List<Patient> showAllPatients() {
    return patientService.getAllPatients();
  }

  // Get patient based on patient_id
  // localhost:8088/api/patients/id
  @GetMapping("/{id}")
  public Patient showPatientById(@PathVariable Long id) {
    return patientService.getPatientById(id);
  }

  @DeleteMapping("/delete/{id}")
  public void deletePatientById(@PathVariable("id") Long id) {
    patientService.deletePatientById(id);
    System.out.println("Data deleted");
  }

}
