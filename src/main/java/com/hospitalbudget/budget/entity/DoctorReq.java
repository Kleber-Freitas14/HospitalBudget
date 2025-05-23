package com.hospitalbudget.budget.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class DoctorReq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameDoctor;
    private String specialty;
    private Integer crm;
    private Integer rqe;

    public DoctorReq(){
    }

    public DoctorReq(Long id, String nameDoctor, String specialty, Integer crm, Integer rqe) {
        this.id = id;
        this.nameDoctor = nameDoctor;
        this.specialty = specialty;
        this.crm = crm;
        this.rqe = rqe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public Integer getRqe() {
        return rqe;
    }

    public void setRqe(Integer rqe) {
        this.rqe = rqe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DoctorReq doctorReq)) return false;
        return Objects.equals(id, doctorReq.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
