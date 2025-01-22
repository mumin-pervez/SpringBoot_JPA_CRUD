package com.mumin.crud.service;

import com.mumin.crud.entity.Patient;
import java.util.List;

public interface PatientService {

  public Patient addPatient(Patient patient);

  public List<Patient> getAllPatients();

  public Patient getPatientById(Long id);

  public void deletePatientById(Long id);
}
