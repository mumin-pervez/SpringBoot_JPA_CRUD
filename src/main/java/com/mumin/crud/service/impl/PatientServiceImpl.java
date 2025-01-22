package com.mumin.crud.service.impl;

import com.mumin.crud.entity.Patient;
import com.mumin.crud.repository.PatientRepository;
import com.mumin.crud.service.PatientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

  @Autowired
  private PatientRepository patientRepository;

  @Override
  public Patient addPatient(Patient patient) {
    return patientRepository.save(patient);
  }

  @Override
  public List<Patient> getAllPatients() {
    return patientRepository.findAll();
  }
}
