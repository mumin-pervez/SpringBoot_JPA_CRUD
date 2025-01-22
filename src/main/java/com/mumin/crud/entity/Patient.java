package com.mumin.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients_info")
public class Patient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "patient_id")
  private Long pId;
  @Column(name = "patient_name")
  private String pName;
  @Column(name = "patient_mobile_no")
  private String pMobileNo;
  @Column(name = "patient_address")
  private String pAddress;

  public Patient() {
  }

  public Patient(Long pId, String pName, String pMobileNo, String pAddress) {
    this.pId = pId;
    this.pName = pName;
    this.pMobileNo = pMobileNo;
    this.pAddress = pAddress;
  }

  public Long getpId() {
    return pId;
  }

  public void setpId(Long pId) {
    this.pId = pId;
  }

  public String getpName() {
    return pName;
  }

  public void setpName(String pName) {
    this.pName = pName;
  }

  public String getpMobileNo() {
    return pMobileNo;
  }

  public void setpMobileNo(String pMobileNo) {
    this.pMobileNo = pMobileNo;
  }

  public String getpAddress() {
    return pAddress;
  }

  public void setpAddress(String pAddress) {
    this.pAddress = pAddress;
  }

  @Override
  public String toString() {
    return "Patient{" +
        "pId=" + pId +
        ", pName='" + pName + '\'' +
        ", pMobileNo='" + pMobileNo + '\'' +
        ", pAddress='" + pAddress + '\'' +
        '}';
  }
}
